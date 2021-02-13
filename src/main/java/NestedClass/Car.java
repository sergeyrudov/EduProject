package NestedClass;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a = 5;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    void method(){
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    interface  I{}

    public static class Engine {
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "Engine power is: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(220);
        System.out.println(engine);

        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}

class Z extends Car.Engine {
    Z() {
        super(200);
    }
}
