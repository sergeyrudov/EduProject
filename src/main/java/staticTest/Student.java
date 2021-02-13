package staticTest;

public class Student {

    String name;
    int course;
    static int count;

    public Student(String name1, int course1) {
        count++;
        name = name1;
        course = course1;
        System.out.println("Student # " + count + " was created");
    }
}


class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Igor", 1);
        Student st2 = new Student("Vasiliy", 2);
        Student st3 = new Student("Petr", 3);

        System.out.println(st1.name);
        System.out.println("Quantity of created objects are: " + Student.count);
        // статические методы принадлежат всему классу, а не отдельным объектам. Существуют и могут
        // быть использованы без создания объекта класса
        // статичные переменные и методы не могут вызывать и обращаться к инстанс переменным и методам !!
        // нет смысла создавать пустую статичную константу

        // для вызова non-static метдов надо создавать объект
    }
}
