package FileReaderExamples.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    // create version class id, to prevent errors in deserialization
    static final long serialVersionUID = 2;
    String name;
    String department;
    int age;
    // transient disallow to serialize sensitive data, such as salary. And didn't write to file
    transient double salary;
    Car car;

    public Employee(String name, String department,
                    int age,
                    double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
