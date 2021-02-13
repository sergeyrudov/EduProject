package ObjectInit;

public class ClassInitExample2 {
    static {
        System.out.println("static Block init 1");
    }
    {
        System.out.println("Block init 3");
    }

    ClassInitExample2() {
        System.out.println("Constructor 1");
    }

    ClassInitExample2(int a) {
        this();
        System.out.println("Constructor 2");
    }

    static {
        System.out.println("static Block init 2");
    }


    public static void main(String[] args) {
        ClassInitExample2 c1 = new ClassInitExample2();
        ClassInitExample2 c2 = new ClassInitExample2(3);

    }
}

