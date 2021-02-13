package Equals;

import java.util.ArrayList;

public class VerifyObjectEquals {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        Car c4 = new Car("black", "V8");

        ArrayList <Car> list = new ArrayList<Car>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        for(Car c: list) {
            System.out.println(c.toString());
        }
        System.out.println(c1.equals(c2));
        System.out.println(list.contains(c4));
    }
}


class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return color + " " + engine;
    }
}
