package StringExample;

public class strCl {

    String color;
    String engine;

    public static void main(String[] args) {
        strCl car1 = new strCl();
        car1.color = "red";
        car1.engine = "V6";

        strCl car2 = new strCl();
        car2.color = "blue";
        car2.engine = "L4";

        if(car1.color == car2.color) {
            System.out.println("OK");
        }
        System.out.println("FALSE");

        if(car1.engine.equals(car2.engine)) {
            System.out.println("ENgine is equal");
        }
    }
}
