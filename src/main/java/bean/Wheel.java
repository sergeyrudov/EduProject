package bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class Wheel {

    public Wheel() {
        System.out.println("Wheel bean created");
    }

}


class Engine {
    private static final Engine INSTANCE = new Engine();

    private Engine() {
        System.out.println("Engine bean created");
    }

    public static Engine getInstance() {
        return INSTANCE;
    }
}

class CarFactory {

    public CarFactory() {
        System.out.println("Factory bean created");
    }

    public Engine createEngine() {
        return Engine.getInstance();
    }

    public Wheel createWheel() {
        return new Wheel();
    }
}



class SpringApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Wheel wheel = context.getBean(Wheel.class);
        System.out.println(wheel);

        Engine engine = context.getBean(Engine.class);
        System.out.println(engine);

        System.out.println("====================");

        ClassPathXmlApplicationContext contextFabric = new ClassPathXmlApplicationContext("beanConfig.xml");
        CarFactory carFactory = contextFabric.getBean(CarFactory.class);
        System.out.println(carFactory);




        BoogieWoogie boogieWoogie = new BoogieWoogie("Boogie Woogie", 12);
        boogieWoogie.dance();
    }

}

class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(toString() + "I dance like all the rest");
    }

    @Override
    public String toString() {
        return "My name is  " + name + ",  am " + age + " old. " ;
    }
}

class BoogieWoogie extends Dancer {

    public BoogieWoogie(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        super.dance();
    }



}

abstract class Hello {
    final String name = "Vasya";
}




