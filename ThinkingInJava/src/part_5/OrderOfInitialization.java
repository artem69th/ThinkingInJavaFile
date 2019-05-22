package part_5;

// Демонстрирует порядок инициализации,
class House {
    Window wl = new Window(1); // Перед конструктором

    House() {
        System.out.println("part_5.House");
        w3 = new Window(33); // Повторная инициализация w3
    }

    Window w2 = new Window(2); // После конструктора

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3); // В конце
}
public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Показывает, что объект сконструирован
    }
}
    class Window {
        Window(int marker) {
            System.out.println("part_5.Window(" + marker + ")");
        }
    }