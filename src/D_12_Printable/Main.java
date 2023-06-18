package D_12_Printable;

interface Printable {
    void print();
}

// Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
public class Main {
    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Printing...");
        printable.print();
    }
}
