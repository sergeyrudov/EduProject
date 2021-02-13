package ObjectInit;

public class Wrapper {
    void abc(short s) {
        System.out.println("byte");
    }
    void abc(int i) {
        System.out.println("int");
    }
    void abc(float f) {
        System.out.println("float");
    }
    void abc(Object o) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        char c = 55;
        w.abc(c);
        w.abc(false);
        w.abc(3.14);
    }
}
