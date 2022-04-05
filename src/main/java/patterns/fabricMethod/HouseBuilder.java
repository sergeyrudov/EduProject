package patterns.fabricMethod;

public class HouseBuilder implements Builder {
    @Override
    public void build() {
        System.out.println("House builder working");
    }
}
