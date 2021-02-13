package ObjectInit;

import javax.crypto.spec.PSource;

public class ClassInitExample3 {
    int a = 3;
    ClassInitExample3() {
        // and here it became 4
        a = 4;
    }

    {
        // non static a = 3
        System.out.println(a);
        a = 5;
        // then a is 5
        System.out.println(a);
    }

    public static void main(String[] args) {
        ClassInitExample3 c1 = new ClassInitExample3();
        System.out.println(c1.a);
    }
}
