import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {

    // Сортировка набора ключей с помощью класса TreeMap в Java

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("2", "Value5");
        map.put("3", "Value1");
        map.put("1", "Value2");
        map.put("4", "Value3");
        map.put("9", "Value4");
        map.put("hi11", "Value6");
        map.put("hi0", "Value7");
        System.out.print("Unordered List: ");
        for (String s : map.keySet()) {
            System.out.print(" " + s);
        }
        System.out.println();
        System.out.print("Ordered List: ");
        TreeMap<String, String> map1 = new TreeMap<>(map);
        for (String s : map1.keySet()) {
            System.out.print(" " + s);
        }
    }
}
