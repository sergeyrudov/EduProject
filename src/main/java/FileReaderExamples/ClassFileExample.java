package FileReaderExamples;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ClassFileExample {
    public static <T> void main(String[] args) throws IOException {
        File file = new File("test10.txt");

        File folder = new File("F:\\udemy\\src\\main\\java\\FileReaderExamples\\pathexample");
        // exception is not appeared, if user fill incorrect address
        File file2 = new File("F:\\udemy\\src\\main\\java\\FileReaderExamples\\pathexample\\Test\\test.txt");
        File file3 = new File("test10.txt");

        File folder2 = new File("F:\\udemy\\src\\main\\java\\FileReaderExamples\\pathexample\\Test");



/*        System.out.println("file absolute path is: " + file.getAbsolutePath());
        System.out.println("folder absolute path is: " + folder.getAbsolutePath());
        System.out.println("--------------------------");

        System.out.println("file absolute path is: " + file.isAbsolute());
        System.out.println("folder absolute path is: " + folder.isAbsolute());
        System.out.println("--------------------------");

        System.out.println("file absolute path is: " + file.isDirectory());
        System.out.println("folder absolute path is: " + folder.isDirectory());
        System.out.println("--------------------------");

        System.out.println("file absolute path is: " + file.exists());
        System.out.println("folder absolute path is: " + folder.exists());
        System.out.println("file absolute path is: " + file2.exists());
        System.out.println("file absolute path is: " + folder2.exists());
        System.out.println("--------------------------");*/


        System.out.println("create new directory " + folder2.mkdir());
        System.out.println("create new file "+ file2.createNewFile());
        System.out.println("length: " + file3.length());
        System.out.println(folder2.isHidden());
        System.out.println(folder2.canRead() +" "+ folder2.canWrite() + file2.canExecute());


        File[] files = folder2.listFiles();
        System.out.println(Arrays.toString(files));

        // удалить папку методом delete() можно только когда она пуста, и в ней нет файлов
        //System.out.println("delete file "+ file2.delete());
        //System.out.println("delete directory " + folder2.delete());
        LinkedList<T> tLinkedList = new LinkedList<>();
        ArrayList<T> arrayList = new ArrayList<>();

        arrayList.add((T) "Hello");
        System.out.println(arrayList);






    }
}
