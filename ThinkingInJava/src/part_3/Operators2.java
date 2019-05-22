package part_3;

import java.util.Random;

class Letter {
    float c;
}
public class Operators2{
    static void Metod(Letter l)
    {
        l.c = 1.1f;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Letter x = new Letter();
        x.c = random.nextFloat();
        System.out.println("x.c = " + x.c);
        Metod(x);
        System.out.println("x.c = " + x.c);
    }
}