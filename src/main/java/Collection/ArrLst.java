package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrLst {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("hello1");      // 1 index
        strList.add("OK");         // replaced as "kak dela?"
        strList.add("privet");     // index 2 ??
        strList.set(1, "kak dela?");
        strList.add(0, "zamena str"); // 0 index
        for (String s: strList) {
            System.out.println(s);
        }


        ArrayList<Object> objList = new ArrayList<>(3);
        objList.add(new Car("BMW", 200));
        objList.add(new Car("Toyota", 330));
        objList.add(new Car("Nissan", 130));

        System.out.println(objList.get(1));



        List<String> st1 = new ArrayList<>();
        st1.add("1");
        st1.add("2");
        st1.add("3");

        String[] names = new String[3];
        names[0] = "Vasya";
        names[1] = "Petr";
        names[2] = "Marina";

        ArrayList<String> strList1 = new ArrayList<>(strList);


        System.out.println(strList.get(1));
        System.out.println(st1);
        System.out.println(names[2]);
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        //System.out.println(hashSet.contains(3));
        for (Integer i: hashSet
             ) {
            System.out.println(i);
        }
    }
}

class Car {

    public String name;
    public int power;

    Car(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public String toString(){
        return "car name: " + name + " car power is: " + power;
    }
}
