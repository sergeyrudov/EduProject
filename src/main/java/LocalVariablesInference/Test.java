package LocalVariablesInference;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // local variable type inference
        var tit = new TestInferenceType();
        var i = 10;
        var w = 1.5f;
        var array = new String[]{"a", "b"};
        var result = abc();
        Object obj1 = "Privet";
        var obj2 = obj1;
        ArrayList <String> a1 = new ArrayList<>();
        for (var s : a1) {
            System.out.println(s);
        }
        String var = "hi";

        var h = 2;
        h = 1;
        System.out.println(h);
    }

    static double abc() {
        return 3.14;
    }
}

class TestInferenceType {}

interface I {
    void abc();
    default void def1(){};
    default void def2(){};
    static void def3(){};
}
