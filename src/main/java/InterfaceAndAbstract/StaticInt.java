package InterfaceAndAbstract;

public class StaticInt {
}

interface T1 {
    default void abc() {
        System.out.println("Hello");
    }
    static void def() {
        System.out.println("statoc method");
    }
}

interface T2 extends T1 {
    @Override
    default void abc() {

    }
}

abstract class R implements T1{
    abstract public void abc();
}
