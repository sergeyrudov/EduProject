package Abstract;


import two.Car;

interface Reader {
    String message = "Hi";

    void regularMethod();

     default <T> T read(T data) {
         return data;
     }

     static void staticMethod() {
         System.out.println("Hi I am static method");
     }



}

interface Writer {
    void write();

    default String returnStr() {
        return "test";
    }

    private Boolean data() {
        return true;
    }

    static int getVal() {
        return 1;
    }

}

public class Example implements Reader {

    public static void main(String[] args) {
        System.out.println(message);
        Reader.staticMethod();
        Example e1 = new Example();

        System.out.println(e1.read("TEST_GEN"));
        System.out.println(e1.read(new Car().power()));

        e1.regularMethod();
    }


    @Override
    public void regularMethod() {
        System.out.println("Method with body");
    }

    @Override
    public <T> T read(T data) {
        return data;
    }
}
