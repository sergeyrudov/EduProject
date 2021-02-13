package three;

public class Three {

    public static void main(String[] args) {
        abc(2,3);
        abcd(1,1);
    }

    static void abc(int a, int b) {
        System.out.println(++ a+b);
    }

    static void abcd(int a, int b) {
        System.out.println(a+ ++b);
    }
}
