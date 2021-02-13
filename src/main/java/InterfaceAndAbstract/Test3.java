package InterfaceAndAbstract;

public class Test3 {
    public static void main(String[] args) {
        Sobaka sobaka = new Sobaka();
        sobaka.bark();
        sobaka.skulit();
    }
}

interface Husky {
    void bark();
    default void skulit() {
        System.out.println("method def");
    }
}

class Sobaka implements Husky {
    public void bark() {
        System.out.println("WOHH WOOH");
    }

    @Override
    public void skulit() {
        System.out.println("Hasky skulit");
    }
}
