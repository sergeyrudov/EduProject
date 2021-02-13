package StringExample;

public class str2CL {

    String status;
    String name;
    String surname;
    int age;

    str2CL(String status, String name, String surname, int age) {
        this.status = status;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main(String[] args) {
        str2CL example1 = new str2CL("good", "Petr", "Ivanov", 22);
        str2CL example2 = new str2CL("average", "Vasiliy", "Ivanov", 22);
        str2CL example3 = example2;
        str2CL example4 = new str2CL("good", "Petr", "Ivanov", 22);



        if (example1.surname.equals(example2.surname)) {
            System.out.println("surname are equals");
        } else {
            System.out.println("surname are different");
        }



        if(example1.status.equals(example4.status)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
