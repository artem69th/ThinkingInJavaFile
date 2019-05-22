package part_7;
class A
{
    public A()
    {
        System.out.println("Конструктор А");
    }
  /*  public A(int i)
    {
        System.out.println("Конструктор А + "+ i);
    }*/
}
class B extends A
{
    public B()
    {
        System.out.println("Конструктор B");
    }
  /*  public B(int i)
    {
        super(i);
        System.out.println("Конструктор B + "+i);
    }*/
}
public class ConstructorExtendTest extends B {
    public ConstructorExtendTest()
    {
       // super(1);
        System.out.println("Конструктор ConstructorExtendTest");
    }

    public static void main(String[] args) {
        ConstructorExtendTest cet = new ConstructorExtendTest();
    }
}
