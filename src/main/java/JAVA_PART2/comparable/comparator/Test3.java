package JAVA_PART2.comparable.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Employee3> list = new ArrayList<>();
        Employee3 emp1 = new Employee3(100, "Igor", "Ivanov", 1234);
        Employee3 emp2 = new Employee3(15, "Vasiliy", "Petrov", 330);
        Employee3 emp3 = new Employee3(1001, "Petr", "Sidorov", 888);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting: \n " + list);
        // сортировка comparator
        Collections.sort(list, new NameComparator());
        Collections.sort(list, new SalaryComparator());

        // сортировка comparable
        Collections.sort(list);

        System.out.println("After sorting: \n " + list);
    }
}

class Employee3 implements Comparable<Employee3> {
    public Integer id;
    public String name;
    public String surname;
    public int salary;

    public Employee3(Integer id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee3 anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

/*class IdComparator implements Comparator<Employee3> {
    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        }
        else if (emp1.id < emp2.id) {
            return -1;
        }
        else {
            return 1;
        }
    }
}*/

class NameComparator implements Comparator<Employee3> {
    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee3> {
    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        // если у emp1 значение больше вернется 1, если у второго больше то -1, если они равны то 0
        return emp1.salary - emp2.salary;
    }
}
