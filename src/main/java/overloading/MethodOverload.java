package overloading;
// перегрузка методов

public class MethodOverload {

    void show(int i1) {
        System.out.println(i1);
    }

    void show(int i2, int c) {
        System.out.println(i2 + c);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }
}


class MethodOverloadTest {
    public static void main(String[] args) {
        MethodOverload methodOverload = new MethodOverload();
        methodOverload.show(2);
        methodOverload.show(5,3);
        boolean b = true;
        methodOverload.show(b);
        String s = "Hello";
        methodOverload.show(s);
    }
}
