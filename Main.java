import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        findMaxMin();
//
//        intercalationYear();

        findNumInMass();


    }

    private static void findNumInMass() {

//        Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//        а остальные - равны ему.
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        num = in.nextInt();
        int[] array = {3,2,2,3};
        int[] array1 = array;

        for (int i = 0; i < array.length; i++){

            System.out.print(array[i] + " ");
        }
        System.out.println();
        numToEnd(array, array1, num);
    }
    public static void numToEnd (int[]array, int[]array1, int num){
        int j =0;
        for(int i = 0; i<array1.length; i++){
            if (array1[i] != num) {
                array[j]=array1[i];
                j++;
            }
        }
        for(int i = j; i<array.length; i++){
            array[i]=num;
        }
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

    }

    private static void intercalationYear() {

        // Написать метод, который определяет, является ли год високосным,
        // и возвращает boolean (високосный - true, не високосный - false).
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year;
        year = in.nextInt();
        boolean leap = false;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            leap = true;
        } else {
            leap = false;
        }
        if (leap){
            System.out.printf(year + " год является високосным!");
        } else {
            System.out.printf(year + " год НЕ является високосным!");
        }

    }

    private static void findMaxMin() {

        // Задать одномерный массив и найти в нем минимальный и максимальный элементы

        int[] array = {1, 6, 3, 0, 3, 8, -1, 7, 5};
        int max = array[0];
        int min = array[0];
        for (int i: array)
            if (i > max){
                max = i;
            }
        for (int j: array)
            if (j < min) {
                min = j;
            }
        System.out.printf("Максимальный элемент: " + max);
        System.out.printf("\nМинимальный элемент: " + min);
    }
}
