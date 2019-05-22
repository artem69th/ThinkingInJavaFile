package part_4;

public class ThisConstructor {

    static void Puk()
    {
        System.out.println("PUUUUK");
    }
    ThisConstructor(int i)
    {
        System.out.println(i +" хуев");
    }

    ThisConstructor(String s)
    {
        this(5);
        System.out.println(s);
    }

    public static void main(String[] args) {
        ThisConstructor t = new ThisConstructor("Ты сосешь ");
        Puk();
    }
}
