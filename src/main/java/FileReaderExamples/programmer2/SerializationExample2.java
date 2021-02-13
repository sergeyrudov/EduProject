package FileReaderExamples.programmer2;

import FileReaderExamples.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationExample2 {
    public static void main(String[] args) throws FileNotFoundException {
        Employee bestEmployee;

        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("employees2.bin")
        )) {
            bestEmployee = (Employee)inputStream.readObject();
            System.out.println(bestEmployee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
