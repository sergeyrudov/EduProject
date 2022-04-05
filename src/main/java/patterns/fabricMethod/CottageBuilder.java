package patterns.fabricMethod;

public class CottageBuilder implements Builder {
    @Override
    public void build() {
        System.out.println("Cottage builder working");
    }
}
