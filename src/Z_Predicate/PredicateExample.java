package Z_Predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        String text = "Пример строки";

        Predicate<String> isNotEmpty = str -> !str.isEmpty();
        boolean result = isNotEmpty.test(text);

        System.out.println(result); // Выводит: true
    }
}
