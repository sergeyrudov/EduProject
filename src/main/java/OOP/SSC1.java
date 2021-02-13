package OOP;

public class SSC1 {
    String name;
    String surname;

    public SSC1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    void sound() {
        System.out.println("Sound");
    }

    String message() {
        return "Hello";
    }

    int quantity() {
        return 100;
    }
}

class SSC2 extends SSC1 {

    public SSC2(String name, String surname) {
        super(name, surname);
    }

    void sound() {
        System.out.println("New sound");
    }

    public static void main(String[] args) {

        SSC1 ssc1 = new SSC1("Igor", "Petrov");
        ssc1.sound();

        SSC2 ssc2 = new SSC2("Vasiliy", "Pupkin");
        ssc2.sound();
    }
}
