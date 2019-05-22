package part_4;

import java.util.Random;

public class ForEachFloat {
    public static void main(String[] args) {
        Random random = new Random(47);
        float f[] = new float[5];
        for(int i = 0; i<5; i++)
            f[i] = random.nextFloat();
       for(float x : f)
           System.out.println(x);

       for(char c : "Hello world!".toCharArray())
           System.out.print(c+ " ");
    }
}
