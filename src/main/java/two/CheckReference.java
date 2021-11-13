package two;


public class CheckReference {
    public static void main(String[] args) {
        Person st1 = new Person();
        Person st2 = new Person();
        st1.age = 5;
        st1.name = " Hello";

        st1.age = 20;
        st1.name = " World";


        Person.updatePerson(st1, 25);

        System.out.println(st1.age + st1.name);

    }
}


class Person {
    int age;
    String name;
    boolean driveLicence;


    public static Person updatePerson(Person person, int age) {
        person.age = age;
        return person;
    }
}
