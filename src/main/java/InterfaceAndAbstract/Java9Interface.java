package InterfaceAndAbstract;

public class Java9Interface {

}

interface i1 {

    private static void method1() {
        System.out.println("static method 1");
    }

    public void method2();

    private void method3() {
        System.out.println("non static method");
    }

    default void method4() {
        method3();
    }

    static void method5() {
        method1();
    }
}

class Test implements i1{
    @Override
    public void method2() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.method2();
    }
}

