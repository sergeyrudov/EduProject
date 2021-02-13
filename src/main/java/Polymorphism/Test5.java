package Polymorphism;

public class Test5 {
    public static void main(String[] args) {
        Test30 test30 = new Test30();
        test30.abc();
        System.out.println(((Test10)test30).a);
        ((Test10)test30).abc();
    }
}

class Test10 {
    int a = 5;
    void abc() {
        System.out.println("OK1");
    }
}

class Test20 extends Test10{
    int a = 10;
    void abc() {
        System.out.println("OK2");
    }
}

class Test30 extends Test20{
    int a = 15;
    void abc() {
        super.abc();
        System.out.println("OK3");
    }
}
