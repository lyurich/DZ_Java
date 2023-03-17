import java.util.*;

public class Task1 {

    // Реализовать консольное приложение, которое:
    // Принимает от пользователя и “запоминает” строки.
    // Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    // Если введено revert, удаляет предыдущую введенную строку из памяти.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordList = new LinkedList<>();

        while (true){
            System.out.print("Если хотите выйти, ведите 'end'. Чтобы продолжить введите строку: ");
            String inputString = in.nextLine();

            if (inputString.length() == 0){
                System.out.println("Строка не должна быть пустой");
                continue;
            }
            else {
                wordList.addLast(inputString);
            }

            if (inputString.equalsIgnoreCase("end")){
                break;
            }
//            System.out.println(wordList);
            if (inputString.equalsIgnoreCase("print")){
                wordList.remove(wordList.size()-1);

                Collections.swap(wordList, 0, wordList.size()-1);

                System.out.println(wordList);
//                break;
            }
            if (inputString.equalsIgnoreCase("revert")){
                wordList.remove(wordList.size()-1);
                wordList.remove(wordList.size()-1);
                System.out.println(wordList);
            }
        }
    }


}
