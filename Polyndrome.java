package Sem2;

public class Polyndrome {
    public static void main(String[] args) {

        System.out.println(isPolyndrome("l4ovvo4l"));
    }

    public static boolean isPolyndrome(String str) {
        for (int i = 0; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
