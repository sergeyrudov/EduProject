package two;



public class StaticExercise {

    public static String path = "hello world";

    public String name;
    public int age;

    StaticExercise(String name, int age) {
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


    @Override
    public String toString() {
        return "StaticExercise{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class TestStatic {
    public static void main(String[] args) {
      StaticExercise st1 = new StaticExercise("Egor", 22);

        StaticExercise.path = "test";

        System.out.println(StaticExercise.path);
    }
}

