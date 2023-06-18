package G_15_Predicate3;

import java.util.function.Predicate;

// Написать программу проверяющую, что строка не null и не пуста,
// используя метод and() функционального интерфейса Predicate.
public class StringCheckProgram {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String str2 = "";
        String str3 = null;

        Predicate<String> notNull = s -> s != null;
        Predicate<String> notEmpty = s -> !s.isEmpty();

        Predicate<String> notNullAndNotEmpty = notNull.and(notEmpty);
        
        if (notNullAndNotEmpty.test(str)) {
            System.out.println("Строка не null и не пуста");
        } else {
            System.out.println("Строка либо null, либо пуста");
        }

        if (notNullAndNotEmpty.test(str2)) {
            System.out.println("Строка не null и не пуста");
        } else {
            System.out.println("Строка либо null, либо пуста");
        }

        if (notNullAndNotEmpty.test(str3)) {
            System.out.println("Строка не null и не пуста");
        } else {
            System.out.println("Строка либо null, либо пуста");
        }
    }
}
