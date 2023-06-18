package P_24_MyThread;

//  Вывод символа в трех потоках
//Необходимо создать три потока, которые изменяют один и тот же объект. Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.
//
//a. Создать класс расширяющий Thread.
//b. Переопределить метод run() - здесь будет находиться синхронизированный блок кода.
//c. Для того чтобы три объекта потока имели доступ к одному объекту, создаем конструктор принимающий на вход StringBuilder объект.
//d. Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта 3.
//e. Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом увеличьте значение символа на 1.
//f. В методе main() создайте один объект класса StringBuilder, используя символ ‘a’.
//g. Затем создайте три экземпляра объекта нашего класса и запустите потоки.
class MyThread extends Thread {
    private StringBuilder stringBuilder;

    public MyThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                char currentChar = stringBuilder.charAt(0);
                stringBuilder.setCharAt(0, ++currentChar);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");

        MyThread thread1 = new MyThread(stringBuilder);
        MyThread thread2 = new MyThread(stringBuilder);
        MyThread thread3 = new MyThread(stringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
