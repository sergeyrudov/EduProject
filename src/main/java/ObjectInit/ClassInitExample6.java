package ObjectInit;

public class ClassInitExample6 {
    String s = "ok";

    {
        System.out.println(s);
    }

    static int i = 0;

    static {
        System.out.println(i);
    }

    static {
        System.out.println(++i);
    }

    ClassInitExample6() {
        System.out.println("Eto constructor");
    }

    public static void main(String[] args) {
        ClassInitExample6 c1 = new ClassInitExample6();
    }
}
