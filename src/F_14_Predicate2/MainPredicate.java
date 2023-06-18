package F_14_Predicate2;

import java.util.function.Predicate;

// Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.
public class MainPredicate {
    public static void main(String[] args) {

        Predicate<String> notNullPredicate = str -> str != null;

        String str1 = "Пример строки";
        String str2 = null;

        if (notNullPredicate.test(str1)) {
            System.out.println("Строка str1 не является null");
        } else {
            System.out.println("Строка str1 является null");
        }

        if (notNullPredicate.test(str2)) {
            System.out.println("Строка str2 не является null");
        } else {
            System.out.println("Строка str2 является null");
        }

    }
}
