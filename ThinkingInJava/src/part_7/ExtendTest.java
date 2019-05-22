package part_7;

public class ExtendTest {
    private String s="";

    public void sumString(String a) {
        s += a;
    }

    public void testSumString1() {
        sumString("Hello");
    }

    public void testSumString2() {
        sumString("World");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        ExtendTest et = new ExtendTest();
        et.testSumString1();
        et.testSumString2();
        System.out.println(et);
    }
}


