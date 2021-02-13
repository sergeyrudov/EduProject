package OverrideExample;

public class ExampleCar {
    public static void main(String[] args) {
        Car car = new Toyota();
        car.color();
        car.driverTrain();
        
        System.out.println(car.wheels());
        System.out.println(car.power());

    }
}
