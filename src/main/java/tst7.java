public class tst7 {
    public static void main(String[] args) {
        Employee c = new Employee();
        ((Special) c).print();
    }
}

class Person{
    void print(){
        System.out.println("1");
    }
}

class Employee extends Person{
    void print(){
        System.out.println("2");
    }
}

class Special extends Employee{
    void print(){
        System.out.println("3");
    }
}
