package NestedClass;

public class InnerClassExample {
    String color;
    int doorCount;
    Engine engine;


    public InnerClassExample(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower); // created inner object
    }


    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine power is: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test1 {
    public static void main(String[] args) {
        InnerClassExample innerClassExample = new InnerClassExample("black", 4, 300);
        System.out.println(innerClassExample);
        InnerClassExample.Engine engine = innerClassExample.new Engine(150);
        System.out.println(engine);
    }
}