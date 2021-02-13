package staticTest;

public class OneMoreTest {
    public static void main(String[] args) {
        helloStatic();
        OneMoreTest.helloStatic();


        OneMoreTest oneMoreTest = new OneMoreTest();
        oneMoreTest.nonStatic();
    }

    static void helloStatic() {
        System.out.println("Hello");


    }

    void nonStatic() {
        System.out.println("non static");
    }
}
