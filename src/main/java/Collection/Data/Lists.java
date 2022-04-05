package Collection.Data;

import java.util.*;


public class Lists {
    public static void main(String[] args) {
        System.out.println(getList());
        System.out.println(getLinkedList());

        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        Integer[] ints = {9,8,7,6,5,4,3,2,1,0,null};
        Iterator<Integer> it = data.iterator();
        Iterator<Integer> its = Arrays.stream(ints).iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (its.hasNext()) {
            System.out.println(its.next());
        }


    }

    public static ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Test6");
        list.add("Test1");
        list.add("Test4");
        list.add("Test2");
        list.add("Test3");
        list.add("Test5");
        return list;
    }

    public static LinkedList<String> getLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Test6");
        linkedList.add("Test1");
        linkedList.add("Test4");
        linkedList.add("Test2");
        linkedList.add("Test3");
        linkedList.add("Test5");
        return linkedList;
    }
}
