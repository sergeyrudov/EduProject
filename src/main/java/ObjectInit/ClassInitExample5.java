package ObjectInit;

public class ClassInitExample5 {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static {
        //static block init
        c=5;
        d=3;
       //error  e=2;
        f=0;
    }

    public static void main(String[] args) {
        ClassInitExample5 c1 = new ClassInitExample5();
        System.out.println(c1.c);
        System.out.println(c1.d);
    }
}
