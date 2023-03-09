package Sem2;

// Дано четное число N (> 0) и символы с1 и с2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов с1 и с2, начинаяс с1.

import java.util.Scanner;

//import static java.lang.VersionProps.build;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(build());
    }

    public static StringBuilder build() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int limit = in.nextInt();

        System.out.print("Введите первый элемент массива: ");
        String first = in.next();

        System.out.print("Введите второй элемент массива: ");
        String second = in.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            sb.append((i % 2 == 0) ? first : second);
        }
        return sb;


    }


}