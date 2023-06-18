package B_10_BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Опишите пример совместной работы двух процессов «производитель-потребитель».
// Для реализации нужно создать два класса Producer  и Consumer.
// Рекомендуется использовать BlockingQueue — расширенный интерфейс обычной очереди
public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);  // Создание очереди с максимальной вместимостью 10

        Producer producer = new Producer(queue, 10);
        Consumer consumer = new Consumer(queue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
