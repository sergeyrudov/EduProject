package AbstractFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;

public class NNM {
    static Node head = null;

    public static void main(String[] args) {
        Node head = new Node("1",
                new Node("2",
                new Node("3",
                new Node("4"

                        ))));

        getText(head);


    }

    public static String getText(Node val) {
        Node current = val;

        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
        return "";
    }

    public static void setTest(Node val, int index) {
        Node newNode = new Node(val.getData());

        Node cur = head;
        Node prev = head;

        if(index == 1) {
            newNode.next = head;
        }



    }
}

@Getter
@Setter
@AllArgsConstructor
class Node {

    String data;
    Node next;

    public Node(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }
}





