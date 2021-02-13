package Equals;

public class ExmplCast {
    void abc(int i) {
        System.out.println(i);
    }

    void abc(byte i) {
        System.out.println(i);
    }

    void abc(long i) {
        System.out.println(i);
    }

    void def(String o) {
        System.out.println("String");
    }

    void def(Object o) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        ExmplCast c1 = new ExmplCast();
        c1.abc((byte)5);
        c1.abc(4);
        c1.def("3");
        c1.def((Object) "2");

    }
}
