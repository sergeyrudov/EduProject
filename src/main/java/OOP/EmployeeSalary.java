package OOP;

public class EmployeeSalary {

    String name;
    String surname;
    double salary = 100;

    public EmployeeSalary(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void work() {
        System.out.println("I am working");
    }
    public void rest() {
        System.out.println("I am chillout");
    }
}

class Uchitel extends EmployeeSalary{
    //double salary = 200;

    public Uchitel(String name, String surname, double salary) {
        super(name, surname, salary);
     //   this.salary = salary;
    }

    public void work() {
        System.out.println("Teacher working");
    }

    public static void main(String[] args) {
        Uchitel uchitel = new Uchitel("Ivanov", "ivan", 100);
    }
}

class Z {
     String foo = "a";
}
class S extends Z {
    String foo = "b";


    public static void main(String[] args) {
        Z z = new Z();
        S s = new S();
        System.out.println(z.foo); // Prints 'a'
        System.out.println(s.foo); // Prints "b"
    }
}

