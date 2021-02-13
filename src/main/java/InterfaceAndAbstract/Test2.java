package InterfaceAndAbstract;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolvostoron);
    }
}

abstract class Figura {

    int kolvostoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }

}

class Kvadrat extends Figura {

    int kolvostoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Perimetr kvadrata = " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }
}

class Pramougolnik extends Figura {
    int kolvostoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Perimetr pramougolnika = " + 2 * (storona1+storona1));
    }

    public void ploshad() {
        System.out.println("Ploshad pramougolnika = " + storona1 * storona2);
    }



}

class Okrujnost extends Figura {
    int kolvostoron = 0;
    int radius = 3;

    public void perimetr() {
        System.out.println("Perimetr okrujnosti = " + 2 * 3.14 * radius);
    }

    public void ploshad() {
        System.out.println("Ploshad okrujnosti = " + 3.14 * radius * radius);
    }
}

abstract class Chetirehugolnik extends Figura {
    void def() {
        System.out.println("Eto Chetirehugolnik");
    }
}

