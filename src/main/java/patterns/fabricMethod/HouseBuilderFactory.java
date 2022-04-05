package patterns.fabricMethod;

public class HouseBuilderFactory implements BuilderFactory {
    @Override
    public Builder createBuilder() {
        return new HouseBuilder();
    }
}
