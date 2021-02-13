package Polymorphism;

public class NumericPromotion {
    public static void main(String[] args) {
        int i = 5;
        long l = 10;
        i = (int) (i*l);
        i*=l;
        System.out.println(i);

        byte b = 3;
        short s = 4;
        char c =5;
        System.out.println(b+s+c);
    }
}
