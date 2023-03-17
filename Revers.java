import java.util.Collections;
import java.util.LinkedList;

public class Revers {

    // Пусть дан LinkedList с несколькими элементами.
    // Реализуйте метод, который вернет “перевернутый” список.

    public static void main(String[] args) {

        LinkedList<String> str = new LinkedList<>();
        Collections.addAll(str, "apple", "orange", "banana", "tomato", "strawberry", "melon");
        System.out.printf("Изначальный список: " + str);
        Collections.reverse(str);
        System.out.printf("\nПеревернутый список: " + str);

    }
//    private static void revers(){
//        str.re
//    }
}
