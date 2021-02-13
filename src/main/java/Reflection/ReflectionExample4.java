package Reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample4 {
    void sum(int a, int b) {
        int result = a+b;
        System.out.println("Sum a and b is: " + result);
    }

    void subtraction(int a, int b) {
        int result = a+b;
        System.out.println("Subtraction a and b is: " + result);
    }

    void multiplication(int a, int b) {
        int result = a+b;
        System.out.println("Multiplication a and b is: " + result);
    }

    void division(int a, int b) {
        int result = a+b;
        System.out.println("Division a and b is: " + result);
    }
}

class TestCalculator{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test100.txt"))) {

            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            ReflectionExample4 t1 = new ReflectionExample4();
            Class c1 = t1.getClass();

            Method method = null;
            Method[] methods = c1.getDeclaredMethods();
            for (Method myMethod: methods) {
                if(myMethod.getName().equals(methodName)) {
                    method = myMethod;
                }
            }
            method.invoke(t1, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
