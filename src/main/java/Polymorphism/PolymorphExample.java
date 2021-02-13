package Polymorphism;

public class PolymorphExample {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        String s1 = null;
        Object o = new Object();

        Employee [] array2 = {emp1, emp2, emp3};
        for (Employee emp : array2) {
            emp.work();
        }

        System.out.println(emp1 instanceof Driver);
        System.out.println(emp1 instanceof Help_able);
        System.out.println(s1 instanceof String);
        System.out.println(o instanceof Teacher);




        Help_able [] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Help_able h = new Teacher();

    }
}

abstract class Employee implements Help_able{
    void sleep() {
        System.out.println("Employee sleeps");
    }
    abstract void work();
}

class Teacher extends Employee implements Help_able{
    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able{
    void work() {
        System.out.println("Driver works");
    }
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements Help_able{
    void work() {
        System.out.println("Doctor works");
    }
    public void help() {
        System.out.println("Doctor helps");
    }
}

interface Help_able {
    void help();
}
