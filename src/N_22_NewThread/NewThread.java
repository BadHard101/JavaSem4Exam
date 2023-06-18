package N_22_NewThread;

public class NewThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start(); // Запускаем новый поток
    }
}
