import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListStaff {
    public static void main(String[] args) {
        TreeMap<String, String> listStaff = new TreeMap<>();
        listStaff.put("Иванов", "Иван");
        listStaff.put("Петрова", "Светлана");
        listStaff.put("Белова", "Кристина");
        listStaff.put("Мусина", "Анна");
        listStaff.put("Крутова", "Анна");
        listStaff.put("Юрин", "Иван");
        listStaff.put("Лыков", "Петр");
        listStaff.put("Чернов", "Павел");
        listStaff.put("Чернышов", "Петр");
        listStaff.put("Федорова", "Мария");
        listStaff.put("Светлова", "Марина");
        listStaff.put("Савина", "Мария");
        listStaff.put("Рыкова", "Мария");
        listStaff.put("Лугова", "Марина");
        listStaff.put("Владимирова", "Анна");
        listStaff.put("Мечников", "Иван");
        listStaff.put("Петин", "Петр");
        listStaff.put("Ежов", "Иван");

        for (Map.Entry<String, String> item : listStaff.entrySet()){
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue());
        }
        Collection<String> nameList = listStaff.values();
        System.out.println();

        System.out.println(nameList);

        Map<String, Long> frequency = nameList.stream().collect(Collectors.groupingBy(
                                                Function.identity(), Collectors.counting()));

        System.out.println();

        frequency.forEach((k, v) -> System.out.printf("Количество повторений имени %-10s %5s %1s %n ", k , " -> " , v));




    }
}
