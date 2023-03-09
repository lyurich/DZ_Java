package Sem2;

import java.util.Random;

public class TestSB {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("a");
        Random random = new Random();

        for (int i = 0; i < 100; i++){
            sb.append((char) random.nextInt(1000));
        }

        System.out.println(sb);
    }
    
}
