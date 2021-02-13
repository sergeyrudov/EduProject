package JAVA_PART2.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Igor", "Kukuzuba", 1234);
        Employee emp2 = new Employee(15, "Pizdak", "Chirkash", 330);
        Employee emp3 = new Employee(1001, "Huylo", "Salo", 888);


        list.add(emp1);
        list.add(emp2);
        list.add(emp3);


        System.out.println("Before sorting: \n " + list);

        Collections.sort(list);

        System.out.println("After sorting: \n " + list);


    }

}

class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;
    private String surname;
    private int salary;

    public Employee(Integer id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        // 1 способ
        /*if (this.id == anotherEmp.id) {
            return 0;
        }
        else if (this.id < anotherEmp.id) {
            return -1;
        }
        else {
            return 1;
        }*/
        // 2 способ
        //return this.id-anotherEmp.id;
        // 3 способ
        //return this.id.compareTo(anotherEmp.id);
        int result =  this.name.compareTo(anotherEmp.name);
        if(result == 0) {
            result = this.surname.compareTo(anotherEmp.surname);
        }
        return result;
    }
}
