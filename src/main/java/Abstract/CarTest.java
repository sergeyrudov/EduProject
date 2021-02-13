package Abstract;

public abstract class CarTest {
    int wheels = 4;

    public String fuel() {
        return "My default fuel is gas";
    }

    String powertrain = "MT";

}


class Jeep extends CarTest{

    @Override
    public String fuel() {
        return "My fuel is diesel";
    }
}

class SportCar extends CarTest {
    String powertrain = "AT";
}

class TstJeep extends Jeep{
    public static void main(String[] args) {
        Jeep jeep = new Jeep();
        System.out.println(jeep.powertrain + " " + jeep.wheels + " " + jeep.fuel());
    }
}

class TstSportCar extends SportCar {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        System.out.println(sportCar.powertrain + " " + sportCar.fuel());
    }
}
