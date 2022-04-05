import java.util.ArrayList;
import java.util.List;

public class Aggregation {
    public static void main(String[] args) {

        Car car = new Car(new Freshener());
        car.drive();
    }
}

class Freshener {

}

class Engine {
    public void drive() {
        System.out.println("Engine is running");
    }
}

class Car {
    Engine engine;
    List<Wheel> wheels;
    Freshener freshener;

    public Car(Freshener freshener) {
        this.freshener = freshener;
        this.engine = new Engine();
        this.wheels = new ArrayList<Wheel>();

        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
        this.wheels.add(new Wheel());
    }

    // delegation
    public void drive() {
        this.engine.drive();
        for (Wheel wheel : wheels) {
            System.out.println("Wheels are running");
        }
    }
}

class Wheel {
    public void drive() {
        System.out.println("Wheels is running");
    }
}
