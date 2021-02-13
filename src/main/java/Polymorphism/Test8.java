package Polymorphism;

public class Test8 {

}

class Test implements interface1, interface2{

    public void abc() {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(((interface1)t).a);
        System.out.println(((interface2)t).a);
        t.abc();

    }
}

interface interface1{
    int a = 5;
    void abc();
}

interface interface2{
    int a = 10;
    void abc();
}
