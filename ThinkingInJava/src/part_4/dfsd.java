package part_4;

import static part_6.Test.print;
public class dfsd
{
    public static void main(String[] args)
    {
    int x = 0, y = 1, z = 2;
    String s = "x, у, z";
    System.out.println(s + x + y + z);
    System.out.println(x + " " + s); // Преобразует x в String s += "(summed) = "; // Оператор конкатенации print(s + (x + у + z))j
    System.out.println("" + x); // Сокращение для Integer.toString()
    s += "(summed) = "; // Оператор конкатенации
    print(s + (x + y + z));
    }
}