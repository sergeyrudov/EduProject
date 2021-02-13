package HashCodeAndEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();

        Student st1 = new Student("Igor", "Petrov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Petr", "Sidorov", 4);

        Student st4 = new Student("Igor", "Petrov", 3);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);

        /*boolean result = map.containsKey(st4);
        System.out.println(result);*/

        //System.out.println(st1.equals(st4));
        System.out.println(st1.hashCode() +" "+ st4.hashCode());
        // entrySet *
        for (Map.Entry<Student, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        // load factor 0.75 is ideal value, between saving memory and speed
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);

    }
}


final class Student{
    final String name;
    final String surname;
    final int course;

    Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }
    public String toString() {
        return name + surname + course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        // return name.length()*7 + surname.length()*11 + course*53;
        return Objects.hash(name, surname, course);
    }
}
