package InterfaceAndAbstract;

public class Example {
    public static void main(String[] args) {
        Jumpable j1 = new Human();
        Jumpable j2 = new Animal();
        j1.jump();
        j2.jump();

        Koshka koshka = new Koshka();
        koshka.jump();
        koshka.voice();
    }
}


class Human implements Jumpable{
    public void jump() {
        System.out.println("Human jump");
    }

    public void voice() {
        System.out.println("Hello");
    }

}

class Animal implements Jumpable{
    public void jump() {
        System.out.println("Animal jump");
    }
    public void voice() {
        System.out.println("wooh wooh");
    }
}

interface Jumpable extends Sound{
    void jump();
}

interface Sound{
    void voice();
}

abstract class Cat implements Jumpable{
    @Override
    public void jump() {
        System.out.println("Cat jump");
    }

    @Override
    public void voice() {
        System.out.println("Cat meow");
    }
}

class Koshka extends Cat {

}