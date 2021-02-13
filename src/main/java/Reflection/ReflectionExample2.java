package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class employeeClass = Class.forName("Reflection.Employee");

        /*Employee o = (Employee)employeeClass.newInstance();
        System.out.println(o);*/

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Petr", "IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.12);
        System.out.println(obj2);


    }
}
