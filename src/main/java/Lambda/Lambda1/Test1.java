package Lambda.Lambda1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
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
        System.out.println("------------------------");
        si.printStudentsOverGrade(list, 8.5);
        si.printStudentsUnderAge(list, 9);
        si.printStudentsOverAge(list, 25);
        si.printStudentsUnderAge(list, 27);
        si.printStudentsBySex(list, 'm');
        si.printStudentsMixConditions(list, 7.2, 23, 'f');
        System.out.println("------------------------");
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
        System.out.println("Student name: " + s.name + ", pol "+ s.sex + "vozrast studenta: " + s.age);
    }

    void printStudentsOverGrade(ArrayList <Student> aL, double avgGrade) {
        for(Student s : aL) {
            if(s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }
    void printStudentsUnderGrade(ArrayList <Student> aL, double avgGrade) {
        for(Student s : aL) {
            if(s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList <Student> aL, int age) {
        for(Student s : aL) {
            if(s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList <Student> aL, int age) {
        for(Student s : aL) {
            if(s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentsBySex(ArrayList <Student> aL, char sex) {
        for(Student s : aL) {
            if(s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentsMixConditions(ArrayList <Student> aL, double avgGrade, int age, char sex) {
        for(Student s : aL) {
            if(s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
    }
}


