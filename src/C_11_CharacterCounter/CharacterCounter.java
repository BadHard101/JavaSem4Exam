package C_11_CharacterCounter;

// Напишите реализацию подсчета символов во всех строках переданных программе строках
// (передать параметры можно с помощью настроек в IntelliJIdea ->Run Configuration)
public class CharacterCounter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input strings provided.");
            return;
        }

        int totalCharacters = 0;

        for (String str : args) {
            int charactersInString = str.length();
            totalCharacters += charactersInString;
            System.out.println("String: " + str);
            System.out.println("Number of characters: " + charactersInString);
            System.out.println();
        }

        System.out.println("Total number of characters in all strings: " + totalCharacters);
    }
}
