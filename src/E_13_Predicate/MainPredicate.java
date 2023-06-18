package E_13_Predicate;

import java.util.function.Predicate;

// Создать лямбда выражение, которое возвращает значение true, если строка не null,
// используя функциональный интерфейс Predicate.
public class MainPredicate {
    public static void main(String[] args) {

        Predicate<String> notNullPredicate = str -> str != null;

        String str1 = "Пример строки";
        String str2 = null;

        System.out.println(notNullPredicate.test(str1));
        System.out.println(notNullPredicate.test(str2));

    }
}
