package R_26_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Существует некий ArrayList<String>, напишите реализацию удаления каждого 5-го элемента.
// Используйте потоки API stream.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        list.add("Element 4");
        list.add("Element 5");
        list.add("Element 6");
        list.add("Element 7");
        list.add("Element 8");
        list.add("Element 9");
        list.add("Element 10");

        List<String> filteredList = IntStream.range(0, list.size())
                .filter(i -> (i + 1) % 5 != 0) // Оставляем только элементы, индексы которых не делятся на 5
                .mapToObj(list::get)
                .collect(Collectors.toList());

        System.out.println("Исходный список:");
        System.out.println(list);
        System.out.println("Список после удаления каждого 5-го элемента:");
        System.out.println(filteredList);
    }
}
