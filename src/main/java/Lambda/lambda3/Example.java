package Lambda.lambda3;

public class Example {
    public static void main(String[] args) {
        def( (x, y) -> {return x.length() + y.length();} );
        def( (var x) -> x.length() );
    }
    static void def(Test11 t) {
        System.out.println(t.abc("83974gbn934bg347gf43g"));
    }

    static void def(Test22 t) {
        System.out.println(t.abc("Privet", "Poka"));
    }
}

interface Test11 {
    int abc(String s1);
}
// лямбда работает только с интерфейсом где есть 1 метод
interface Test22 {
    int abc(String s1, String s2);
}
