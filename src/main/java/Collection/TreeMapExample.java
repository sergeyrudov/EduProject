package Collection;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<StudentExample, Double> map = new TreeMap<>();

        StudentExample st1 = new StudentExample("Igor", "Petrov", 3);
        StudentExample st2 = new StudentExample("Mariya", "Ivanova", 1);
        StudentExample st3 = new StudentExample("Petr", "Sidorov", 4);
        StudentExample st4 = new StudentExample("Vasiliy", "Pupkov", 3);
        StudentExample st5 = new StudentExample("Ivan", "Kapistin", 1);
        StudentExample st6 = new StudentExample("Roman", "Smirnov", 4);
        StudentExample st7 = new StudentExample("Vitaliy", "Petrov", 3);
        StudentExample st8 = new StudentExample("Masha", "Smirnova", 1);
        StudentExample st9 = new StudentExample("Nastya", "Sidorova", 4);
        StudentExample st10 = new StudentExample("Nastya", "Sidorova", 4);

        // supported unique keys
        map.put(st1, 5.8);
        map.put(st8, 8.9);
        map.put(st3, 7.2);
        map.put(st4, 7.5);
        map.put(st2, 6.4);
        map.put(st6, 3.5);
        map.put(st7, 2.8);
        map.put(st9, 7.3);
        map.put(st5, 8.0);
        map.put(st10, 3.2);

        System.out.println(map.get(st8));
        System.out.println(map.descendingKeySet());
        System.out.println(map.tailMap(st5));
        System.out.println(map.headMap(st6));
        System.out.println(map.firstEntry());
    }
}


class StudentExample implements Comparable<StudentExample>{
     String name;
     String surname;
     int course;

    StudentExample(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    public String toString() {
        return name + surname + course;
    }


    @Override
    public int compareTo(StudentExample studentExample) {
        return this.name.compareTo(studentExample.name);
    }
}
