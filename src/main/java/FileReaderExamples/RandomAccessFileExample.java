package FileReaderExamples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
     public static void main(String[] args) {
        try (RandomAccessFile file
                     = new RandomAccessFile("test10.txt", "rw")){

            int a = file.read();
            System.out.println((char)a);

            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(51);
            String s2 = file.readLine();
            System.out.println(s2);


            long position = file.getFilePointer();
            System.out.println(position);

            // navigate to end of file
            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\tAuthor");


            /*file.seek(0);
            file.writeBytes("privet");*/

            /*a = file.read();
            System.out.println((char)a);*/


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}
