package part_5;

public class Number19 {

    static void printArray(String ... strings)
    {
        for(String s : strings)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String ... args) {
        String[] array = new String[]{"раз", "два", "три"};
        printArray(array);
        String s1="раз",s2="два",s3="три";
        printArray(s1,s2,s3);

    }
}
