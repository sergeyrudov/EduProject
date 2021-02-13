package Polymorphism;

public class Ex44Inst {
    public static void main(String[] args) {
        Human1 h1 = new Human1("Igor", "Ivanov");
        Human1 h2 = new Human1("Vasiliy", "Petrov");
        Human1 h3 = new Human1("Mariya","Sidorova");
        Human1 h4 = new Human1("Svetlana", "Borova");
        Human1 h5 = new Human1("Vladimir", "Kukuzuba");

        Object [] o = {h1, h2, h3, h4, h5};
        for (Object i : o) {
            System.out.println(i.toString());
        }
        System.out.println(h1 instanceof  Human1);
    }
}


class Human1 {
    String name;
    String surname;

    Human1(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String toString() {
        return name + " " + surname;
    }
}
