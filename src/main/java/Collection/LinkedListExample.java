package Collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student st1 = new Student("ivan", 4);
        Student st2 = new Student("Nikolay", 2);
        Student st3 = new Student("Elena", 1);
        Student st4 = new Student("Petr", 5);
        Student st5 = new Student("Mariya", 2);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);

        studentLinkedList.remove(st4);

        //System.out.println("Linked list = " + studentLinkedList);
        //System.out.println(studentLinkedList.size());
        //System.out.println(studentLinkedList.get(1));
        System.out.print(studentLinkedList);
    }
}



class Student{
    public String name;
    public int course;

    Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "student name: " + name + " and course:  " + course;
    }
}