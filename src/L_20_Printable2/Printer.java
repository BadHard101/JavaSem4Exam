package L_20_Printable2;

class Printer {
    static void printMessage() {
        System.out.println("Printing message...");
    }
}

// Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
// Переделать класс использующий Printable используя ссылку на статический метод
class Main {
    public static void main(String[] args) {
        Printable printable = Printer::printMessage;
        printable.print();
    }
}
