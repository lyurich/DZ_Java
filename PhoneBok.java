import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBok {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> book = new HashMap<>();
        book.put("Иванов Леонид", new ArrayList<>(Arrays.asList(999999, 777777)));
        book.put("Иванов Иван", new ArrayList<>(Arrays.asList(888888)));
        book.put("Петров Петр", new ArrayList<>(Arrays.asList(666666, 555555)));
        book.put("Сидоров Сидор", new ArrayList<>(Arrays.asList(444444, 333333)));
//        System.out.println("ФИО" + "Номер телефона");
        String name = "Name";
        String phone = "Phone number";
        System.out.printf("%-20s %18s %n", name, phone);
        System.out.println("------------------------------------------");
        for (String key : book.keySet()){
//            System.out.println("ФИО: " + key + ", Номер телефона: " + book.get(key));
            System.out.printf("%-20s %20s %n", key, book.get(key));

        }
    }
}
