package OverrideAndOverload.exampleOverride;

public class Test {
    public static void foo() {
        System.out.println("Test.foo() called ");
    }
    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }
    public static void main(String[] args)
    {
        Test.foo(); //Test.foo() called  printed
        Test.foo(10); //Test.foo(int) called printed
    }
}


class Demo1 {
    public static void main(String[] args) {
        Test.foo();
        Test.foo(5);
        int a = 5;
        a = 10;

        String v = "Test";
        v = "33";
    }
}

interface sing{
    static int kek = 3;

    default void voice() {
        
    }
}