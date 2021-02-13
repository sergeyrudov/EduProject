package OOP;


// extends -> derived class, Child class, Subclass, Extended class
// super class, parent class, base class класс от которого наследуемся
class InheritanceDoctor{

    static void salaryIncrease(Employee e, double value){
        e.salary = e.salary + value;
    }
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.name = "Ivan";
        doctor.age = 50;
        doctor.exp = 25;
        doctor.eat();
        doctor.heal();
        doctor.sleep();
        salaryIncrease(doctor, 120.0 );
        System.out.println(doctor.salary);
        doctor.specializaciya = "Hirurg";

        Employee employee = new Doctor();
        Employee employee1 = new Teacher();
        Employee employee2 = new Driver();
        employee.sleep();

        doctor.eat();
    }
}

class Eda {}
class Frukti extends Eda{}

class Doctor extends Employee{
    String specializaciya;
    @Override
    Frukti eat() {
        System.out.println("Kushaet Doctor");
        Frukti f = new Frukti();
        return f;
    }
    void heal() {
        System.out.println("Heal");
    }
}

class Teacher extends  Employee{
    String kolvoUchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends  Employee{
    String carName;
    void vodit() {
        System.out.println("Vodit");
    }

}


class Employee extends java.lang.Object{
    double salary = 100;
    String name;
    int age;
    int exp;
    Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }
    void sleep() {
        System.out.println("Sleep");
    }
}


class Q {
    Employee objectCreation() {
        return new Employee();
    }
}

class W extends Q {
    Teacher objectCreation() {
        System.out.println("OK");
        return new Teacher();
    }
}


