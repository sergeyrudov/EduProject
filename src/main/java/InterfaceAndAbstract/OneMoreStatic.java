package InterfaceAndAbstract;


public class OneMoreStatic {
}

interface F1 {
    default void abc() {
        System.out.println("Hello");
    }
    static void def() {
        System.out.println("static method 1");
    }
}

interface F2 {
    static void def() {
        System.out.println("static method 2");
    }
}

abstract class V implements F1, F2{
    public static void main(String[] args) {
        F1.def();

    }
}

class N implements F1, F2 {
    public static void main(String[] args) {
        F1.def();
        F2.def();
    }
}

