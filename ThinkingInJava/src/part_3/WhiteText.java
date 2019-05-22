package part_3;

import java.util.Random;

public class WhiteText
{
    public static void main(String[] args)
    {
        int i,j=0, count=0;
        Random random = new Random();
        while(count<25){
            i = random.nextInt(100);
            System.out.print(count +" число = " + i+" ");
            if(i==j)
                System.out.println("Числа равны");
            else if(i>j)
                System.out.println(i + " больше " + j);
            else
                System.out.println(i + " меньше "+ j);

            j=i;count++;
        }
    }
}
