package patterns.fabricMethod;

public class Demo {
    public static void main(String[] args) {
        BuilderFactory builder = createBuilder("metro");
        Builder result = builder.createBuilder();

        result.build();
    }

    static BuilderFactory createBuilder(String spec) {
        if (spec.equalsIgnoreCase("house")) {
            return new HouseBuilderFactory();
        } else if (spec.equalsIgnoreCase("metro")) {
            return new MetroBuilderFactory();
        } else if(spec.equalsIgnoreCase("cottage")){
            return new CottageBuilderFactory();
        } else throw new RuntimeException("spec invalid");
    }
}
