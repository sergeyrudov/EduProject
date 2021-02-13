package Equals;

public class StaticVarArgs {
    static void abc(String s) {
        System.out.println("A");
    }
    static void abc(String ... s) {
        System.out.println("B");
    }
    static void abc(Object s) {
        System.out.println("C");
    }
    static void abc(String s1, String s2) {
        System.out.println("D");
    }
    static void def(Long a) {
        System.out.println("E");
    }
    static void def(Long ... a) {
        System.out.println("F");
    }
    static void def(long ... a) {
        System.out.println("G");
    }
    static void def(long a) {
        System.out.println("H");
    }
    static void def(Object ... a) {
        System.out.println("I");
    }
    static void def(Integer ... a) {
        System.out.println("J");
    }

    public static void main(String[] args) {
        StaticVarArgs st = new StaticVarArgs();
        st.abc("OK");
        st.abc("Hello", "Privet");
        st.abc("1", "2", "3");
        st.def(10);
    }
}
