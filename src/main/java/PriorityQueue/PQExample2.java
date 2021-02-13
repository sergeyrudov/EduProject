package PriorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PQExample2 {
    public static void main(String[] args) {

        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        System.out.println(priorityQueue);

        PriorityQueue<Integer> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add(6);
        stringPriorityQueue.add(10);
        stringPriorityQueue.add(1);
        stringPriorityQueue.add(9);
        stringPriorityQueue.add(0);
        stringPriorityQueue.add(-3);

        System.out.println(stringPriorityQueue);
    }
}


class Student implements Comparable<Student>{
    String name;
    int course;

    Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    public String toString(){
        return name+ " " + course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course-o.course;
    }
}
