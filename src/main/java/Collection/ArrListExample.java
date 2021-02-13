package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrListExample {
    public static void main(String[] args) {
        Cars car1 = new Cars("Honda", 123);
        Motorcycle moto1 = new Motorcycle("Yamaha", 330);

        ArrayList<Cars> carsArrayList = new ArrayList<>();
        carsArrayList.add(car1);

        ArrayList<Motorcycle> motorcycleArrayList = new ArrayList<>();
        motorcycleArrayList.add(moto1);


        for (int i = 0; i<carsArrayList.size();  i++) {
            System.out.println(carsArrayList.get(i));
            for (int j = 0; j<motorcycleArrayList.size(); j++) {
                System.out.println(motorcycleArrayList.get(j));
            }
        }
    }
}

class Cars implements detailsForCar{
    public String name;
    public int power;

    Cars(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        status();
        return "car name: " + name + " car power: " + power;
    }

    @Override
    public void status() {
        System.out.println("Car is ready!");
    }
}

class Motorcycle implements detailsforBike{
    public String name;
    public int maxSpeed;
    public String type = engineType;

    Motorcycle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        status();
        return "motorcycle name: " + name + " max speed is : " + maxSpeed + type;
    }


    @Override
    public void status() {
        System.out.println("bike is ready");
    }
}

interface detailsforBike{
    public String engineType = "V2";
    public void status();
}

interface detailsForCar{
    public String transmission = "Auto";
    public void status();
}
