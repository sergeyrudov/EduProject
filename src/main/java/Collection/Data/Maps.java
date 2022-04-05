package Collection.Data;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        System.out.println(getHashTable());
        // random order,
        // O(1),
        // null not allowed,
        // inherited from Map interface,
        // synchronized,
        // buckets

        System.out.println(getLinkedHashMap());
        // order according to insertion,
        // O(1),
        // null allowed,
        // inherited from Map interface,
        // non synchronized,
        // linked list inside

        System.out.println(getTreeMap());
        // natural order,
        // O(log(n)),
        // null not allowed,
        // inherited from Map ->Sorted Map ->Navigable Map,
        // non synchronized,
        // Red Black tree


        System.out.println(getMap());
        // random order,
        // O(1),
        // null allowed,
        // inherited from Map,
        // non synchronized,
        // Bucket

    }

    public static LinkedHashMap<String, String> getLinkedHashMap() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Test2", "1");
        linkedHashMap.put("Test2", "2");
        linkedHashMap.put("Test3", "3");
        linkedHashMap.put("Test4", "4");
        linkedHashMap.put("Test5", "5");
        linkedHashMap.put("Test6", "6");
        return linkedHashMap;
    }

    public static Hashtable<String, String> getHashTable() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("Test2", "1");
        hashtable.put("Test2", "2");
        hashtable.put("Test3", "3");
        hashtable.put("Test4", "4");
        hashtable.put("Test5", "5");
        hashtable.put("Test6", "6");
        return hashtable;
    }

    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Test2", "1");
        map.put("Test2", "2");
        map.put("Test3", "3");
        map.put("Test4", "4");
        map.put("Test5", "5");
        map.put("Test6", "6");
        map.put("Test7", "7");
        map.put("Test8", "8");
        map.put("Test9", "9");
        map.put("Test10", "10");
        return map;
    }

    public static TreeMap<String, String> getTreeMap() {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Test9", "9");
        treeMap.put("Test5", "5");
        treeMap.put("Test2", "1");
        treeMap.put("Test7", "7");
        treeMap.put("Test2", "2");
        treeMap.put("Test3", "3");
        treeMap.put("Test4", "4");
        treeMap.put("Test6", "6");
        treeMap.put("Test8", "8");
        treeMap.put("Test10", "10");
        return treeMap;
    }
}
