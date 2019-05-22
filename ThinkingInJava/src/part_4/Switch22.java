package part_4;

import java.util.Random;

public class Switch22 {
    public static void main(String[] args) {
        Random r=new Random();
        for(int i=0;i<5;i++) {
            int c = r.nextInt(5);
            switch (c)
            {
                case(1):
                    System.out.println("1");
                    break;

                case(2):
                    System.out.println("2");
                    break;
                case(3):
                    System.out.println("3");
                    break;

                case(4):
                    System.out.println("4");
                    break;

                case(5):
                    System.out.println("5");
                    break;
            }

        }
    }
}
