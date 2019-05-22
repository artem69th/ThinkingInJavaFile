package part_5;

public class TestArraySomeSize {

    static void f(int i, Object ... objects) {
        System.out.print("обязательно " + i + " ");
        for (Object s : objects)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "один");
        f(2, "два", "три", 'a', 11.1212);
        f(0);
    }
}
