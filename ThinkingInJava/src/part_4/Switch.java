package part_4;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        Random rand = new Random(47);

        for (int i = 0; i < 10; i++) {
            int c = rand.nextInt(32) + 'а';
            System.out.print((char) c + ": ");
            switch (c) {
                case 'а':
                case 'е':
                case 'о':
                case 'ю':
                case 'ы':
                case 'ё':
                case 'и':
                case 'я':
                case 'у':
                    System.out.println("главсная");
                    break;
                default:
                    System.out.println("согласная");
            }
        }
    }
}