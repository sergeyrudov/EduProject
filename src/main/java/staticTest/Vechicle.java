package staticTest;


class Vechicle {

    String name;
    String engine;

    Vechicle(String name, String engine) {
        this.name = name;
        this.engine = engine;
    }
}


class VechicleTest {
    public static void main(String[] args) {
        Vechicle vechicle = new Vechicle("Honda", "V8");
        System.out.println(vechicle.engine);
        System.out.println(vechicle.name);
    }
}


