package ArrayListExample;
import java.util.ArrayList;

public class Lesson20 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car car = new Car();
        list.add(car);
        Student student = new Student();
        list.add(student);
        list.add(new StringBuilder("OK"));

        ArrayList <String> list2 = new ArrayList<String>();
        list2.add("poka");

        ArrayList <String> list3 = new ArrayList<>();

        ArrayList <StringBuilder> list4 = new ArrayList<>();
        list4.add(new StringBuilder("OK"));

        ArrayList <StringBuilder> list5 = new ArrayList<>(30);
        list5.add(new StringBuilder("hi"));
        list5.clear();
    }
}

class Car{}
class Student{}
