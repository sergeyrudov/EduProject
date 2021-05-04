package AbstractFactory;


import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Names {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Ivan", 22, true, 100);
        Employee emp2 = new Employee("Vasiliy", 32, false, 400);
        Employee emp3 = new Employee("Petr", 42, true, 300);
        Employee emp4 = new Employee("Masha", 26, false, 200);

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        employeeList.sort(new SalaryComparator());
        System.out.println(employeeList);

        Data<String> dataStr = new Data<>("Hello world");
        Data<Integer> dataInteger = new Data<>(199288);
        System.out.println(dataStr);
        System.out.println(dataInteger);


        List<String> list = new ArrayList<>(Arrays.asList("something1","something2","something3"));

        String val = Generic.getValue(list, 1);
        System.out.println(val);

        // invoke NPE exception
        //String v = "Test11";
        //System.out.println(v.charAt(10));



    }
}


@AllArgsConstructor
@Getter
@ToString
class Employee {

    String name;
    int age;
    boolean driveLicence;
    int salary;

}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSalary() - emp2.getSalary();
    }
}

@Getter
@AllArgsConstructor
@ToString
class Data <T> {

    private final T value;

}

class Generic {
    public static <T> T getValue(List<T> val, int index) {
        return val.get(index);
    }
}