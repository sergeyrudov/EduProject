package OverrideExample;

public class Toyota extends Car {
    @Override
    public void color() {
        System.out.println("Blue");
    }

    @Override
    public int power() {
        return 180;
    }

    @Override
    public int wheels() {
        return 3;
    }

    @Override
    public void driverTrain() {
        System.out.println("AWD");
    }
}
