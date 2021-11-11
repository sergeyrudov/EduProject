package DTO;

class MyClass{

    public static void firstMethod (){
        System.out.println("static method");
    }

    public void secondMethod (){
        System.out.println("non static method");
    }

}


class Demo {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        m1.secondMethod();

        MyClass.firstMethod();



    }


}
