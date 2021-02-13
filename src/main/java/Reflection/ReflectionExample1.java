package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionExample1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        // 1 variant of class creation
        Class employeeClass = Class.forName("Reflection.Employee");
        // 2 variant of class creation
        Class employeeClass2 = Employee.class;


        // 3 variant of class creation
        Employee emp = new Employee();
        Class employeeClass3 = emp.getClass();


        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field is: " + someField.getType());
        System.out.println("---------------------------------------");

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of: " + field.getName() + " = " + field.getType());
        }
        System.out.println("---------------------------------------");

        // get private fields
        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Type of: " + field.getName() + " = " + field.getType());
        }

        System.out.println("---------------------------------------");


        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of increaseSalary method: " + someMethod1.getReturnType() +
                ", parameter types: " + Arrays.toString(someMethod1.getParameterTypes()));

        System.out.println("---------------------------------------");


        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of setSalary method: " + someMethod2.getReturnType() +
                ", parameter types: " + Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("---------------------------------------");


        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method: " + method.getName() +
                    " and return type: " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("---------------------------------------");

        // employeeClass.getDeclaredMethods() will return only methods which class contains (with private methods also), and exclude methods which inherited from Object class

        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method: " + method.getName() +
                    " and return type: " + Arrays.toString(method.getParameterTypes()));
        }


        System.out.println("---------------------------------------");

        // this example will return only public methods
        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method: " + method.getName() +
                        " and return type: " + Arrays.toString(method.getParameterTypes()));
            }
        }

        System.out.println("---------------------------------------");

        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor 1 has: " + constructor1.getParameterCount() +
                " parameters, theis types are: " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("---------------------------------------");

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor 2 has: " + constructor2.getParameterCount() +
                " parameters, theis types are: " + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("---------------------------------------");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor: constructors) {
            System.out.println("Constructors has name: " + constructor.getName() +
                    "has parameters: " + constructor.getParameterCount() +
                    "and types: " + Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
