package B_10_BlockingQueue;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = queue.take();  // Получение элемента из очереди (если очередь пуста, поток блокируется)
                System.out.println("Потреблено: " + item);
                Thread.sleep(2000);  // Задержка для имитации процесса потребления
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}