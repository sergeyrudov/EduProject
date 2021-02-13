package AnnotationsExamples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation{

}


class Test{
    public static void main(String[] args) {
        Employee employee = new Employee("Petr", 1200);
        employee.increaseSalary();
    }
}

@MyAnnotation
public class Employee {
    String name;
    double salary;


    public Employee(String name, @MyAnnotation double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
    @Deprecated
    public void increaseSalary() {
        salary*=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}




