package O_23_Runnable;

public class PrintRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }

            try {
                Thread.sleep(100); // Пауза в 100 миллисекунд
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Создание трех потоков
        Thread thread1 = new Thread(new PrintRunnable());
        Thread thread2 = new Thread(new PrintRunnable());
        Thread thread3 = new Thread(new PrintRunnable());

        // Запуск потоков
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
