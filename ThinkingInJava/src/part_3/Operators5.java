package part_3;

class Dog{
    String name;
    String says;
}
public class Operators5{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "Bobik";
        d2.name = "Tuzik";
        d1.says = "Gav";
        d2.says = "Gav-gav";
        System.out.println("Первого пса зовут "+ d1.name +" и он говорит " +d1.says +"\nВторого пса зовут "+ d2.name +" и он говорит " +d2.says);

        Dog dog = new Dog();
        d1 = dog;
        System.out.println(d1.equals(dog));
        System.out.println(d1 == dog);
    }
}