package Sem2;

// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd
//        выход a4b3cd2
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println(letterCount());
    }

    public static StringBuilder letterCount() {
       StringBuilder sb = new StringBuilder();
       String str = "aaaabbbbbcdddeee";
       int count = 1;
       for (int i = 0; i < str.length() - 1 ; i++){
           if (str.charAt(i) == str.charAt(i + 1)){
               count++;

           }else{
               sb.append(str.charAt(i)).append(count);
               count = 1;
           }
       }
        sb.append(str.charAt(str.length()-1)).append(count);
        return sb;
    }



}
