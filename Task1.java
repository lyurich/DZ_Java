package DZ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    // Пусть дан произвольный список целых чисел, удалить из него четные числа
    // (в языке уже есть что-то готовое для этого)

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(10));
        }
        System.out.printf("Изначальный список: " + arr);



        for (int i = 0; i < arr.size();) {
            if (arr.get(i)%2 == 0)
                arr.remove(i);
            else i++;

        }
        System.out.printf("\nПолучившийс список: " + arr);
    }


}
