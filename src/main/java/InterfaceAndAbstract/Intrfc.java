package InterfaceAndAbstract;


public class Intrfc {
    public static void main(String[] args) {
        HelpAble h = new Driver();
        SwimAble s = new Driver();
        Employee e = new Driver();
        System.out.println(h.status);
        h.pomosh();
        h.tishitPojar();
        s.swim("Krolom");
    }
}


class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher extends Employee implements HelpAble{
    int kolvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }

    public void pomosh() {
        System.out.println("uchitel ikazivaet pomosh");
    }

    public void tishitPojar() {
        System.out.println("pojar tushit");
    }
}

class Driver extends Employee implements HelpAble, SwimAble{
    String carName;

    void driver() {
        System.out.println("ya edu");
    }
    public void pomosh() {
        System.out.println("ya plivu");
    }
    public void tishitPojar() {
        System.out.println("- pojar");
    }

    public void swim(String stil) {
        System.out.println("ya plavayu");
        System.out.println(voda);
        System.out.println(status);
    }
}

interface HelpAble{
    void pomosh();
    void tishitPojar();
    public static final String status = "OK";
}

interface SwimAble {
    void swim(String stil);
    boolean voda = true;
}

interface acting extends SwimAble {
    void sound();
}

abstract class Y implements  SwimAble{}
abstract class X extends Y{}
class Z extends Y{

    public void swim(String s){
        System.out.println("123");
    }
}
