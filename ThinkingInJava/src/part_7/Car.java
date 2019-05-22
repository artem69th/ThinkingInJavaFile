package part_7;
//двигатель
class Engine {
    public void start() {} // запустить
    public void rev() {} // переключить
    public void stop() {} // остановить
    public void service(String s){
        System.out.println("Отремонтировать " +s);
    }//ремонт двигателя
}
// колесо
class Wheel{
public void inflate(int psi){} // накачать
        }
// окно
class Window {
    public void rollup() { } // поднять

    public void rolldown() { } // опустить
}
// дверь
class Door {
    public Window window = new Window(); // окно двери

    public void open() {
    } // открыть

    public void close() {
    } // закрыть
}
// машина
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door(); // двухдверная машина

    public Car() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service("двигатель");
    }
}
