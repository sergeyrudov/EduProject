package OOP;

public class OverloadedConstructor {

}

class Human2{

    Human2(String n) {
        this(n, null);
    }

    Human2 (String n, String s) {
        name = n;
        surname = s;
    }

    String name;
    String surname;
}

// super() это метод образения к предку
class Student2 extends Human2 {

    Student2() {
        this(5);
        System.out.println("Hello");
    }

    Student2(int i) {
        super("Vasiliy");
    }


    public static void main(String[] args) {
        Student2 s = new Student2();
        Student2 s2 = new Student2(3);
    }
}
