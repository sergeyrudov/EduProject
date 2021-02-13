package Lambda.lambda3;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3 );
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4 );
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9 );
        Student st4 = new Student("Petr", 'm', 35, 4, 7 );
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1 );

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo si = new StudentInfo();

        si.testStudents(list, (Student st) -> {return st.avgGrade > 8.5;});
        System.out.println("----------------------------------------");
        si.testStudents(list, st -> st.avgGrade < 9);
        System.out.println("----------------------------------------");
        si.testStudents(list, st -> {int z =5; return st.age > 25;});
        System.out.println("----------------------------------------");
        si.testStudents(list, st -> {return st.age < 27;});
        System.out.println("----------------------------------------");
        si.testStudents(list, (Student st) -> {return st.sex == 'm';});
        System.out.println("----------------------------------------");
        si.testStudents(list, (Student st) -> {return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f';});
        System.out.println("----------------------------------------");


    }
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student (String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo {
    void printStudent(Student s) {
        System.out.println("Student name: " + s.name + ", pol " + s.sex + "vozrast studenta: " + s.age);
    }

    void testStudents(ArrayList<Student> aL, test sc) {
        for (Student s : aL) {
            if (sc.testStudent(s)) {
                printStudent(s);
            }
        }
    }
}

interface test {
    boolean testStudent(Student s);
}
