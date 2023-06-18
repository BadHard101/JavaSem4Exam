package I_17_HeavyBox;

import java.util.function.Consumer;

// Написать лямбда выражение, которое принимает на вход объект типа HeavyBox
// и выводит на консоль сообщение “Отгрузили ящик с весом n”.
// “Отправляем ящик с весом n” Используем функциональный интерфейс Consumer и метод по умолчанию andThen.
public class Main {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(50); // Пример создания объекта HeavyBox с весом 50

        Consumer<HeavyBox> shipmentConsumer = box -> {
            System.out.println("Отгрузили ящик с весом " + box.getWeight());
        };

        Consumer<HeavyBox> sendingConsumer = box -> {
            System.out.println("Отправляем ящик с весом " + box.getWeight());
        };

        Consumer<HeavyBox> combinedConsumer = shipmentConsumer.andThen(sendingConsumer);

        combinedConsumer.accept(heavyBox); // Вызов лямбда-выражения с объектом HeavyBox в качестве аргумента
    }
}

class HeavyBox {
    private int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
