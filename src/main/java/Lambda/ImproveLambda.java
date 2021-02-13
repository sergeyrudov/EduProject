package Lambda;


import java.util.ArrayList;

public class ImproveLambda {
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

        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();

        FindStudentsOverAge fsoa = new FindStudentsOverAge();
        FindStudentsUnderAge fsua = new FindStudentsUnderAge();

        FindStudentsBySex fsbs = new FindStudentsBySex();
        FindStudentsMixedConditions fsmc = new FindStudentsMixedConditions();

        si.testStudents(list, fsog);
        System.out.println("------------------------");
        si.testStudents(list, fsug);
        System.out.println("------------------------");
        si.testStudents(list, fsoa);
        System.out.println("------------------------");
        si.testStudents(list, fsua);
        System.out.println("------------------------");
        si.testStudents(list, fsbs);
        System.out.println("------------------------");
        si.testStudents(list, fsmc);
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

    void testStudents(ArrayList<Student> aL, StudentsCheks sc) {
        for (Student s : aL) {
            if (sc.testStudent(s)) {
                printStudent(s);
            }
        }
    }
}

class FindStudentsOverGrade implements StudentsCheks {

    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentsCheks {

    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade < 9;
    }
}

class FindStudentsOverAge implements StudentsCheks {

    @Override
    public boolean testStudent(Student s) {
        return s.age > 25;
    }
}

class FindStudentsUnderAge implements StudentsCheks {

    @Override
    public boolean testStudent(Student s) {
        return s.age < 27;
    }
}

class FindStudentsBySex implements StudentsCheks {

    @Override
    public boolean testStudent(Student s) {
        return s.sex == 'm';
    }
}

class FindStudentsMixedConditions implements StudentsCheks {

    @Override
    public boolean testStudent(Student s) {
        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}


interface StudentsCheks {
    boolean testStudent(Student s);
}