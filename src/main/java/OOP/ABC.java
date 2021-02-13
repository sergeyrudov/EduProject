package OOP;

public class ABC {
    public static void main(String[] args) {
        A1 c1 = new C();
        c1.abc(new B());

        C c2 = new C();
        c2.abc(new B());
    }
}

class A1 {
    void abc(B a) {
        System.out.println("A");
    }
}
class B1 extends A1 {
    void abc(B1 b1) {
        System.out.println("B");
    }
}

class C extends B1 {
    void abc(B b2) {
        System.out.println("C");
    }
}
