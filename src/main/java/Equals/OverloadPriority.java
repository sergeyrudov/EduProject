package Equals;

public class OverloadPriority {
    void abc(int a, int b) {
        System.out.println("Hello 1");
    }
    void abc(long a, long b) {
        System.out.println("Hello 2");
    }
    void abc(Integer a, Integer b) {
        System.out.println("Hello 3");
    }
    void abc(int ... a) { //var args
        System.out.println("Hello 4");
    }

    public static void main(String[] args) {
        OverloadPriority o = new OverloadPriority();
        o.abc(1,2);
        o.abc((long)3, (long)4);
        o.abc((Integer)5, (Integer)6);
        o.abc(7,8,9);
    }
}
