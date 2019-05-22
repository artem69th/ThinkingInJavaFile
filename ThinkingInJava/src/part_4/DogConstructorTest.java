package part_4;

public class DogConstructorTest
{
    void bark(String s, int i)
    {
        System.out.println("Собаку зовут " + s +" и ей "+ i+ " лет");
    }

    void bark(int i, String s)
    {
        System.out.println("Собаке " + i + " лет. И ее зовут " + s);
    }

    void bark(char c)
    {
        System.out.println("Собака " + c);
    }

    public static void main(String[] args) {
        DogConstructorTest d = new DogConstructorTest();
        d.bark(5, "Джек");
        d.bark("Джек", 5);
        d.bark('S');
    }
}
