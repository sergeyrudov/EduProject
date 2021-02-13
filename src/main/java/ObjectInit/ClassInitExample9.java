package ObjectInit;

public class ClassInitExample9 {
    public static void main(String[] args) {
        //Animal a = new Animal();
        Lion l = new Lion();
    }
}


class Animal {

    Animal() {
        System.out.println("animal constr");
    }
    static  {
        System.out.println("static init for animal");
    }
    {
        System.out.println("non static init for animal");
    }
}

class Mammol extends Animal {
    Mammol() {
        System.out.println("Mammol constr");
    }
    static  {
        System.out.println("static init for Mammol");
    }
    {
        System.out.println("non static init for Mammol");
    }
}


class Lion extends  Mammol {
    Lion() {
        System.out.println("Lion constr");
    }
    static  {
        System.out.println("static init for Lion");
    }
    {
        System.out.println("non static init for Lion");
    }
}
