import java.util.Scanner;

public class Task3 {

    // Создать список типа ArrayList<String>.
    // Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();

        System.out.println(text.replaceAll("[0-9]", ""));
    }
}
