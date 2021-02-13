package one;

public class House1 extends HouseModel {
    @Override
    public void openDoor() {
        System.out.println("House overrided Door opened");
    }

    @Override
    public void closeDoor() {
        System.out.println("House overrided Door closed");
    }
}
