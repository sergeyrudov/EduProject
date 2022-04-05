package patterns.fabricMethod;

public class CottageBuilderFactory implements BuilderFactory {
    @Override
    public Builder createBuilder() {
        return new CottageBuilder();
    }
}
