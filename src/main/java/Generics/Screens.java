package Generics;

import lombok.*;
import lombok.Data;

public class Screens <V1, V2> {
    private V1 value1;
    private V2 value2;

    public Screens(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}


@Getter
@ToString
class Gen<T> {
    T ob; // объявление объекта типа T

    // Передать конструктору ссылку на объект типа T
    Gen(T o) {
        ob = o;
    }

    // Вернуть ob
    T getob() {
        return ob;
    }

    // Показать тип T
    void showType() {
        System.out.println("Тип T: " + ob.getClass().getName());
    }

}

@ToString
@AllArgsConstructor
@Getter
class User {
    private String name;
    private int age;

}

@ToString
@AllArgsConstructor
@Getter
class Employee {
    private String name;

}
 
class Demo {
    public static void main(String[] args) {
        User user = new User("Name", 22);
        Employee employee = new Employee("Start");

        Gen<User> val1 = new Gen<User>(user);
        Gen<Employee> val2 = new Gen<>(employee);

        val1.showType();
        System.out.println(val1.toString());
        System.out.println(val1.getob());
        System.out.println(val2.getob());
    }


}


