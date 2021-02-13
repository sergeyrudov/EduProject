package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExmp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Masha");
        queue.add("Ivan");
        queue.offer("Alex");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove("Alex"));
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue.peek());
    }
}
