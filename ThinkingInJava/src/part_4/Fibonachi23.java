package part_4;

import java.util.Scanner;

public class Fibonachi23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введете число: ");
        if(scanner.hasNextInt()) {
            int in = scanner.nextInt();
            if (in > 2) {
                int fibonachi[] = new int[in];
                fibonachi[0] = 1;
                fibonachi[1] = 1;

                for (int i = 2; i < in; i++)
                    fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];

                for (int i = 0; i < in; i++)
                    System.out.print(fibonachi[i]+ " ");
            }
            else
                System.out.println("Введите целое положительное число!");
        }else
            System.out.println("Введите целое положительное число!");
    }
}
