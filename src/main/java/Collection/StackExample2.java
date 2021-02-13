package Collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("Misha");
        strings.push("Katya");
        strings.push("Igor");
        strings.push("Petr");
        //strings.add("privet");

        System.out.println(strings);
        /*while (!strings.isEmpty()){
            System.out.println(strings.pop()); // LIFO "Petr"
            System.out.println(strings);
        }*/
        System.out.println(strings.peek());
    }
}
