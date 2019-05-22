package part_5;

// Вывод начальных значений, присваиваемых по умолчанию,
class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValues() {
        System.out.println("Тип данных      Начальное значение");
        System.out.println("boolean         "+t);
        System.out.println("char            "+"["+c+"]");
        System.out.println("byte            "+b);
        System.out.println("short           "+s);
        System.out.println("int             "+i);
        System.out.println("long            "+l);
        System.out.println("float           "+f);
        System.out.println("double          "+d);
        System.out.println("reference       "+reference);
    }
    InitialValues()
    {
        i=75;
    }

    public static void main(String[] args) {

        new InitialValues().printInitialValues();
    }
}
