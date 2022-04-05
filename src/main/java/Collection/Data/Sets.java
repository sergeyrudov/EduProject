package Collection.Data;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


/*
HashSet хранит элементы в произвольном порядке, но зато быстро ищет. Подходит, если порядок Вам не важен, но важна скорость.
Более того, для оптимизации поиска, HashSet будет хранить элементы так, как ему удобно.

LinkedHashSet будет хранить элементы в порядке добавления, но зато работает медленнее.

TreeSet хранит элементы отсортированными.

 */
public class Sets {
    public static void main(String[] args) {
        // natural order,
        // null not allowed,
        // inherited from Sorted Set,
        // Red Black tree
        System.out.println(getTreeSet());


        // random order,
        // null allowed,
        // inherited from Set,
        System.out.println(getHashSet());


        // order according to insertion
        // null allowed
        // linked list inside
        System.out.println(getLinkedHashSet());


    }

    public static TreeSet<String> getTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Test6");
        treeSet.add("Test2");
        treeSet.add("Test2");
        treeSet.add("Test3");
        treeSet.add("Test4");
        treeSet.add("Test5");
        return treeSet;
    }

    public static HashSet<String> getHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Test6");
        hashSet.add("Test2");
        hashSet.add("Test2");
        hashSet.add("Test3");
        hashSet.add("Test4");
        hashSet.add("Test5");
        hashSet.add(null);
        return hashSet;
    }

    public static LinkedHashSet<String> getLinkedHashSet() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Test6");
        linkedHashSet.add("Test2");
        linkedHashSet.add("Test2");
        linkedHashSet.add("Test3");
        linkedHashSet.add("Test4");
        linkedHashSet.add("Test5");
        linkedHashSet.add(null);
        return linkedHashSet;
    }
}
