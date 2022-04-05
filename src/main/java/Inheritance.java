import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

@Getter
public class Inheritance {

   private String _name;
   private int _int;
   private boolean license;
   private String[] characteristics;

    public Inheritance(String _name, int _int, boolean license) {
        this._name = _name;
        this._int = _int;
        this.license = license;
        this.characteristics = null;
    }

    public void setCharacteristics(String[] characteristics) {
        this.characteristics = characteristics;
    }
}

@AllArgsConstructor
@Getter
class PersonCl {
    private String name;
    private int age;

    public void greeting() {
        System.out.printf("Hello, I am Person %s and my age is %s%n", name, age);
    }
}

class Human extends PersonCl {
    private boolean driveLicense;
    private String occupation;

    Human(String name, int age, boolean driveLicense, String occupation) {
        super(name, age);
        this.driveLicense = driveLicense;
        this.occupation = occupation;
    }

    public void greeting() {
        System.out.println("test");
    }
}

@Getter
class Developer extends Human {
    private String specialistLevel;

    Developer(String name, int age, boolean driveLicense, String occupation, String specialistLevel) {
        super(name, age, driveLicense, occupation);
        this.specialistLevel = specialistLevel;
    }
}

class Demo {
    public static void main(String[] args) {
        Inheritance in1 = new Inheritance("Vasya", 33, true);
        in1.setCharacteristics(new String[]{"ff"});

        System.out.println(Arrays.toString(in1.getCharacteristics()));

        Developer d1 = new Developer("Vasya", 32, true, "AQA", "Middle");
        System.out.println(d1.getSpecialistLevel());

        PersonCl p1 = new Developer("Ivan", 41, false, "QA", "Senior");
        System.out.println(p1.getAge());

        d1.greeting();
        p1.greeting();
    }
}


