package B_10_BlockingQueue;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int maxItems;

    public Producer(BlockingQueue<Integer> queue, int maxItems) {
        this.queue = queue;
        this.maxItems = maxItems;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < maxItems; i++) {
                queue.put(i);  // Добавление элемента в очередь
                System.out.println("Произведено: " + i);
                Thread.sleep(1000);  // Задержка для имитации процесса производства
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}