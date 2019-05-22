package part_5;

//массив переменной длины
class B { int i; }

public class VarArgs {
    //static void printArray(Object[] args)
    static void printArray(Object ... args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
        public static void main(String[] args) {
            printArray(new Object[]{new Integer(47), new Float(3.14), new Double(11.11)});
            printArray(new Object[]{"pa3", "два", "три", "четыре"});
            printArray(new Object[]{new B(), new B(), new B()});
            printArray((Object[])new Integer[]{ 1, 2, 3, 4 });
            printArray();
    }
}