package part_7;

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "сконструирован";
    }

    public String toString() {
        return s;
    }
}
    public class Test1 {
        private String valvel, valve2, valve3 = "Hello World", valve4;
        private WaterSource source = new WaterSource();
        private int i;

        public Test1()
        {
            valve2 = "Test1"; //инициализация в конструкторе класса
        }
        public String toString() {
            if (valvel == null) //отложенная инициализация
                valvel = "NotNull";
            return
                    "valvel = " + valvel + " " +
                            "valve2 = " + valve2 + " " +
                            "valve3 = " + valve3 + " " +
                            "valve4 = " + valve4 + "\n" +
                            "i = " + i + "\n" +
                            "source = " + source;
        }

        public static void main(String[] args) {
            Test1 sprinklers = new Test1();
            System.out.println(sprinklers);
        }
    }
