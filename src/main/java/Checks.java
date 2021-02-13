import java.util.Objects;

public class Checks {
    public static void main(String[] args) {

        House h1 = new House("Mira", 10);
        House h2 = new House("Mira", 10);

        System.out.println(h1.equals(h2));

    }
}



class House{
    String name;
    int flat;


    House(String name, int flat){
        this.name = name;
        this.flat = flat;
    }

    public String toString() {
        return name + flat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return flat == house.flat &&
                Objects.equals(name, house.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flat);
    }
}
