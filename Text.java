package Sem2;

import java.io.FileWriter;

public class Text {

    // Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
    // который запишет эту строку в простой текстовый файл, обработайте исключения.

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        try{
            try (FileWriter f1 = new FileWriter("test.txt")) {
                f1.write(String.valueOf(sb));
                f1.flush();
            }
        }catch (Exception e){
            System.out.println("FAIL");
        }
    }
}
