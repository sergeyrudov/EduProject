package two;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LombokTest {
    private String name;
    private int age;
    private boolean state;


    public static void main(String[] args) {
        LombokTest t1 = new LombokTest();
        t1.age = 1;
        t1.name = "dd";
        t1.state = true;

        System.out.println(t1.age);
    }
}



