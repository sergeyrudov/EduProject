package Polymorphism;

public class CastingExample {

    public static void main(String[] args) {
        Help_able1 h = new Doctor1();
        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();
        Employee1 emp4 = new Employee1();
        Employee1 [] array = {emp1, emp2, emp3, emp4};
        for(Employee1 emp: array) {
            if(emp instanceof Driver1) {
                System.out.println(((Driver1) emp).carName);
                ((Driver1)emp).drive();
            }
        }
        Doctor1 d1 = (Doctor1) emp1;
        //d1.heal();

       // System.out.println(((Doctor1)emp1).specializaciya);
       // System.out.println(new Doctor1().specializaciya);

        //System.out.println(((Doctor1)h).specializaciya);
       // ((Doctor1)h).heal();
    }
}

class Employee1 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int exp;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Sleep");
    }
}

class Doctor1 extends Employee1 implements Help_able1{
    String specializaciya = "Terapevt";
    void heal() {
        System.out.println("Doctor lechit");
    }

    @Override
    public void help() {
        System.out.println("Doktor pomogaet");
    }
}

class Teacher1 extends Employee1 {
    int kolvouchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver1 extends Employee1 {
    String carName = "BMW";

    void drive() {
        System.out.println("To drive");
    }
}

interface Help_able1{
    void help();
}