package part_7;

public class CheckExtendTest extends ExtendTest
{
    public void testSumString1() //переопределение метода рожительского класса
    {
        sumString("GoodBye");
        super.testSumString1();
    }
    public void testSumString3() //добавление нового клааса
    {
        sumString("!");
    }

    public static void main(String[] args) {
        CheckExtendTest cet = new CheckExtendTest();
        cet.testSumString1();
        cet.testSumString2();
        cet.testSumString3();
        System.out.println(cet);
        System.out.println();
        ExtendTest.main(args);
    }
}