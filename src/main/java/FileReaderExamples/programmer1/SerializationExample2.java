package FileReaderExamples.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan Tiida", "White");
        Employee employees = new Employee("Mariya", "IT", 28, 500.00, car);


        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin")
        )){
            outputStream.writeObject(employees);
            System.out.println("DONE!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
