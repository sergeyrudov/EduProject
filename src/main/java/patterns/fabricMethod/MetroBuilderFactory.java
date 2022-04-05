package patterns.fabricMethod;

public class MetroBuilderFactory implements BuilderFactory {
    @Override
    public Builder createBuilder() {
        return new MetroBuilder();
    }
}
