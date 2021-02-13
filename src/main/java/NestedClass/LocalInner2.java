package NestedClass;

public class LocalInner2 {
    public static void main(String[] args) {
        class SLojenie implements Math2 {

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        SLojenie s = new SLojenie();
        System.out.println(s.doOperation(5, 3));
    }
}

interface Math2{
    int doOperation(int a, int b);
}
