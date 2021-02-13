package ArrayExamples;

public class Car {

    String name;
    String engine;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "V6");
        String[] arr1 = new String[4];

        for (int i = 0; i < arr1.length; i++) {
                arr1[i] = car.engine;
                arr1[i] = car.name;
                System.out.println(arr1[i]);
            }
        }
    }

