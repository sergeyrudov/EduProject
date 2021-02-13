package ObjectInit;


public class ClassInitExample {
    String name;
    String surname;


    ClassInitExample() {
        System.out.println("this is default constructor");
    }

    ClassInitExample(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("this is custom constructor");
    }

    {
        System.out.println("This is init block 1");
    }

    {
        System.out.println("This is init block 2");
    }

    public static void main(String[] args) {
        ClassInitExample c1 = new ClassInitExample();
        ClassInitExample c2 = new ClassInitExample();
        ClassInitExample c3 = new ClassInitExample("Vasya", "Pupkin");


    }
}
