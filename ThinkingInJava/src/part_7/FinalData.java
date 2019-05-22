package part_7;

import java.util.*;

class Value {
    int i; // доступ в пределах пакета

    public Value(int i) {
        this.i = i;
    }
}
public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    // Могут быть константами времени компиляции:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // Типичная открытая константа:
    public static final int VALUE_THREE = 39;
    // Не может быть константой времени компиляции:
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value vl = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
// Массивы:
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": ” + i4 = " + i4 + " INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fdl = new FinalData("fdl");
    //! fdl.valueOne++; // Ошибка: значение нельзя изменить

        fdl.v2.i++; // Объект не является неизменным!
        fdl.vl = new Value(9); // OK - не является неизменным
        for (int i = 0; i < fdl.a.length; i++)
            fdl.a[i]++; // Объект не является неизменным!
    //! fdI.v2 = new Value(0); // Ошибка: ссылку
    // ! fdl.VAL_3 = new Value(l); // нельзя изменить
    // ! fdl.a = new int[3];

        System.out.println(fdl);
        System.out.println("Co3flaeM FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fdl);
        System.out.println(fd2);
    }
}