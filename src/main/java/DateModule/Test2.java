package DateModule;

import java.time.LocalDate;
import java.time.Month;

public class Test2 {
    public static void main(String[] args) {
        Car c = Car.createCar();

        LocalDate ld1 = LocalDate.of(2015, 6, 10);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2018, Month.AUGUST, 15);
        System.out.println(ld2);
    }
}


class Car {
    private Car() {
    }

    static Car createCar() {
        return new Car();
    }
}
