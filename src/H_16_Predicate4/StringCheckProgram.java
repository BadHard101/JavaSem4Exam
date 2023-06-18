package H_16_Predicate4;

import java.util.function.Predicate;

// Написать программу, которая проверяет, что строка начинается буквой “J” или “N”
// и заканчивается “A”. Используем функциональный интерфейс Predicate.
public class StringCheckProgram {
    public static void main(String[] args) {
        String inputString = "JavA";
        
        Predicate<String> stringCheckPredicate = str ->
                (str.startsWith("J") || str.startsWith("N")) && str.endsWith("A");
        
        boolean isMatch = stringCheckPredicate.test(inputString);
        
        if (isMatch) {
            System.out.println("Строка соответствует условию.");
        } else {
            System.out.println("Строка не соответствует условию.");
        }
    }
}
