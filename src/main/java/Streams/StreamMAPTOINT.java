package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMAPTOINT {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());

        List<Double> avgGrade = students.stream()
                .mapToDouble(el -> el.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());

        int sum = students.stream().mapToInt(el->el.getCourse()).sum();

        double avg = students.stream().mapToInt(el->el.getCourse()).average().getAsDouble();

        int min = students.stream().mapToInt(el->el.getCourse()).min().getAsInt();

        int max = students.stream().mapToInt(el->el.getCourse()).max().getAsInt();


        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
        System.out.println(courses);
        System.out.println(avgGrade);

        // int converted to Integer by boxed method
    }
}
