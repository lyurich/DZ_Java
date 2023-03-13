import java.util.*;

public class Task2 {

    // Задан целочисленный список ArrayList.
    // Найти минимальное, максимальное и среднее арифметическое из этого списка.

    public static void main(String[] args) {

        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(10));
        }
        System.out.println("Изначальный список: " + arr);

        System.out.println("Минимальный элемент: " + Collections.min(arr));
        System.out.println("Максимальный элемент: " + Collections.max(arr));

        double average = 0;
        for (double num: arr){
            average +=num;
        }
        System.out.println("Среднее арифметическое: " + average/arr.size());
    }
}
