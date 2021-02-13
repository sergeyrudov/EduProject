package NestedClass;

public class AnonymousInnerClass extends Math4{
    private int x = 5;

    public static void main(String[] args) {
        // anonymous class without name
        Math1 m = new Math1(){
            int c = 10;
            void abc(){

            }
            @Override
            public int doOperation(int a, int b){
                AnonymousInnerClass ac = new AnonymousInnerClass();
                return a+b+ ac.x;
            }
        };
        System.out.println(m.doOperation(3, 6));

        Math1 m2 = new Math1(){
            int c = 10;
            void abc(){

            }
            @Override
            public int doOperation(int a, int b){
                return a*b;
            }
        };
        System.out.println(m2.doOperation(5, 7));

        Math4 m4 = new Math4(){
            @Override
            int doOperation(int a, int b) {
                return super.doOperation(a, b);
            }
        };
        System.out.println(m4.doOperation(8, 4));
    }
}

interface Math1{
    int doOperation(int a, int b);
}

class Math4{
    int doOperation(int a, int b){
        return a+b;
    }
}
// анонимных интерфейсов не существует
