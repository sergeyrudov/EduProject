package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(15, "Petr", 12345);
        Employee emp2 = new Employee(15, "Ivan", 4455);
        Employee emp3 = new Employee(123, "Mariya", 8778);
        Employee emp4 = new Employee(182, "Elena", 3245);
        Employee emp5 = new Employee(15, "Pavel", 6709);
        Employee emp6 = new Employee(250, "Igor", 8788);
        Employee emp7 = new Employee(100, "Kseniya", 5774);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);

        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);

        int index2 = Collections.binarySearch(employeeList, new Employee(250, "Igor", 8788));
        System.out.println(index2);
    }
}



class Employee implements Comparable<Employee>{
    public int id;
    public String name;
    public int salary;

    Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "id: " + id + " name: " + name + " salary: " + salary;
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
