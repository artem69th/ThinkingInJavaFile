package part_4;

class Tree{
    int heigth;
    Tree()
    {
        System.out.println("Сажаем росток.");
        heigth = 0;
    }

    Tree(int inistalHeigth)
    {
        heigth = inistalHeigth;
        System.out.println("Создание нового дерева высотой " + heigth +"м.");
    }

    void info()
    {
        System.out.println("Дерево высотой "+ heigth +"м.");
    }

    void info(String s)
    {
        System.out.println(s + " дерево высотой " + heigth +"м.");
    }
}

public class Overloading
{
    public static void main(String[] args) {
        new Tree();
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегруженный метод");
        }
    }
}