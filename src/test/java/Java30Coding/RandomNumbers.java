package Java30Coding;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(100));
            //random numbers between 0 to 99
        }
    }

}