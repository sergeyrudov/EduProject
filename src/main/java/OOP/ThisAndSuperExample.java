package OOP;

public class ThisAndSuperExample {

    ThisAndSuperExample(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String name;
    String surname;
}

class WorkMan extends ThisAndSuperExample {
    int age;

    WorkMan(String name, String surname, int age) {
        super(name, surname);
        this.age = age;
    }

    public static void main(String[] args) {
        WorkMan workMan = new WorkMan("Vasiliy", "Pupkin", 25);
        System.out.println(workMan.age);
        System.out.println(workMan.name);
        System.out.println(workMan.surname);

    }
}
