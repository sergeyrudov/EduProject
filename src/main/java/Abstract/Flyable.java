package Abstract;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface Flyable {

    default void getFly() {
        System.out.println("I get fly");
    }

    static void fly() {
        System.out.println("static fly");
    }


}
