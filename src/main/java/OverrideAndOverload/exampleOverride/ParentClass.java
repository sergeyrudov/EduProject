package OverrideAndOverload.exampleOverride;

public class ParentClass {
    public ParentClass(String name, int age, boolean driveLicense) {
        this.name = name;
        this.age = age;
        this.driveLicense = driveLicense;
    }

    String name = "";
    int age = 0;
    boolean driveLicense = false;

    public void goDrive() {
        System.out.println("I am driving");
    }

    public void buyCar() {
        System.out.println("Car was bought");
    }

    public void buyCar(String name) {
        System.out.println("car " + name + "was bought");
    }

    public void howAreYou() {
        System.out.println("How are you");
    }
}

class ChildClass extends ParentClass {

    public ChildClass(String name, int age, boolean driveLicense) {
        super(name, age, driveLicense);
    }

    @Override
    public void buyCar() {
        System.out.println("I can't buy car");
    }

    @Override
    public void buyCar(String name) {
        super.buyCar(name);
    }

    @Override
    public void goDrive() {
        System.out.println("I can't drive");
    }

    @Override
    public void howAreYou() {
        super.howAreYou();
    }
}

class Demo {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Bob", 17, true);
        childClass.buyCar();

    }
}
