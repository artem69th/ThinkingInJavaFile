package part_4;

public class KonstructorTest {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test("Artem");
    }
}

class Test
{
    Test()
    {
        System.out.println("Hello world!");
    }

    Test(String s)
    {
        System.out.println("Hello "+ s + "!");
    }
}
