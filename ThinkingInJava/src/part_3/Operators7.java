package part_3;

import java.util.Random;

public class Operators7 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean b = random.nextBoolean();
        if(b == true)
            System.out.println("Орел");
        else
            System.out.println("Решка");
    }
}
