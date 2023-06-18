package J_18_Function;

import java.util.function.Function;

// Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
// “Отрицательное число” или “Ноль”. Используем функциональный интерфейс Function.
public class Main {
    public static void main(String[] args) {
        Function<Integer, String> checkNumber = (number) -> {
            if (number > 0) {
                return "Положительное число";
            } else if (number < 0) {
                return "Отрицательное число";
            } else {
                return "Ноль";
            }
        };

        System.out.println(checkNumber.apply(5));    // Положительное число
        System.out.println(checkNumber.apply(-3));   // Отрицательное число
        System.out.println(checkNumber.apply(0));    // Ноль
    }
}
