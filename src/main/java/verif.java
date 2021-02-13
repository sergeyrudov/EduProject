public class verif {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1("Petr", 100.1);
        Student st1 = new Student("Vasiliy", 165.13, 22);

        Employee1 emp2 = new Student("Masha", 22.223, 99);

        System.out.println(emp1.name + emp1.salary);
        System.out.println(st1.id + st1.name + st1.salary);
    }
}



class Employee1{
    String name;
    double salary;

    Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
         return name + salary;
    }

    public void message() {
        System.out.println("Employee created");
    }

}

class Student extends Employee1{
    int id;

    Student(String name, double salary, int id) {
        super(name, salary);
        this.id = id;
        super.message();
    }

    public String toString() {
        return name + salary + id;
    }
}
