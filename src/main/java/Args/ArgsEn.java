package Args;

public class ArgsEn {

    public static void main(String[] args) {
        summa("Hello",6, 4, 10);
        sum(new int[]{3, 5});
        abc(2, new int[2]);
        //abc(2, {0,1});
        //abc(1,{2});
        abc(0,1,2);
        abc(0,1);
        abc(3);
        cde(5);
    }

    static void cde (int a) {
        System.out.println("hello");
    }

    static void cde (int ... a){
        System.out.println("privet");
    }

    static void summa(String s, int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }

    static void sum(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        System.out.println(suma);
    }

    static void abc(int a, int ... b){
        System.out.println(b.length);
    }
}
