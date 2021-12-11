import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

public class ParseINT extends TestAbstr{

    public ParseINT(String name, int age) {
        super(name, age);
    }

    @Override
    void hello() {

    }

    public static void main(String[] args) {
        String a = "12345678 ";
        int b = 0;
        try {
            b = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println("there is some error in input string " + e);
        }
       // System.out.println(b);

        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i =0;i< random.nextInt(10);i++){
            System.out.println(list.add(i));
        }

       // System.out.println(list);


    }



}

interface h1 {

}

interface h2 extends h1{

}

abstract class TestAbstr {
    String name;
    int age;

    public TestAbstr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     abstract void hello();
}
