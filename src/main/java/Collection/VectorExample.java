package Collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();
        stringVector.add("Stepan");
        stringVector.add("Mikhail");
        stringVector.add("Katya");
        stringVector.add("Igor");

        System.out.println(stringVector);
        System.out.println(stringVector.firstElement());
        System.out.println(stringVector.lastElement());
        System.out.println(stringVector.remove(1));
        System.out.println(stringVector.get(2));
    }
}
