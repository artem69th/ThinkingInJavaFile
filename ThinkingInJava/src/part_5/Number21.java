package part_5;

public class Number21 {
    public enum Money
    {
        DOLLAR, EURO, RUBLES, UAN
    }

    Money money;

    public Number21(Money money) {
        this.money = money;
    }
    public void describe()
    {
        switch(money)
        {
            case DOLLAR:
                System.out.println("DOLLAR - This is a USA national valute");
                break;

            case EURO:
                System.out.println("EURO - This is a Europe valute");
                break;

            case UAN:
                System.out.println("UAN - This is valute of China");
                break;

            case RUBLES:
                System.out.println("RUBLES - This is national valute of Russia");
        }
    }

    public static void main(String[] args) {
        Number21 dol = new Number21(Money.DOLLAR);
        Number21 eu = new Number21(Money.EURO);
        Number21 ua = new Number21(Money.UAN);
        Number21 rub = new Number21(Money.RUBLES);
        dol.describe();
        eu.describe();
        ua.describe();
        rub.describe();
        for (Money m : Money.values()) {
            System.out.println(m + " имеет номер " + m.ordinal() + " в перечислении");
        }
    }
}
