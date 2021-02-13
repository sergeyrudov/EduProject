package ObjectInit;

public class ClassInitExample4 {
    static final int b;
    static int a = 5;

    static {
        a = 10;
        b = 15;
    }

    public static void main(String[] args) {
        ClassInitExample4 c1 = new ClassInitExample4();
        System.out.println(c1.b);
        System.out.println(c1.a);
    }
}
