package Reflection;

import java.lang.reflect.Field;

public class ReflectionExample3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Ivan", "IT");

        Class employeeClass = employee.getClass();

        Field field = employeeClass.getDeclaredField("bonus");
        field.setAccessible(true);

        double bonusValue = (double) field.get(employee);
        System.out.println(bonusValue);

        Field field1 = employeeClass.getDeclaredField("salary");
        field1.setAccessible(true);

        field1.set(employee, 3444);
        System.out.println(employee);

    }
}
