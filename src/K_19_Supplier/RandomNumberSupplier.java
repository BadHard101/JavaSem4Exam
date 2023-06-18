package K_19_Supplier;

import java.util.Random;
import java.util.function.Supplier;

// Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
// Используем функциональный интерфейс Supplier.
public class RandomNumberSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(11);
        int randomNumber = randomNumberSupplier.get();
        System.out.println(randomNumber);
    }
}
