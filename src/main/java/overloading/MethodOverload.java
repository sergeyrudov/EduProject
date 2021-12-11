package overloading;
// перегрузка методов

import java.util.ArrayList;
import java.util.List;

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
    
    double show(double d1) {
       return d1;
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
        methodOverload.show(1.1);

        List<Number> list = new ArrayList<Number>(List.of(3,4, 1.2));
        list.contains(1);
    }
}
