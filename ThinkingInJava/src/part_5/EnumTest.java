package part_5;

public class EnumTest {
    public enum Splines{
        HELLO, HOT, ONE
    }

    public static void main(String[] args) {
        Splines e = Splines.HELLO;
        System.out.println(e);
        for(Splines s : Splines.values())
            System.out.println(s +"= номер " + s.ordinal());
        System.out.println();
    }
}
