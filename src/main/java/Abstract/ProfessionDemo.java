package Abstract;

public class ProfessionDemo {
    public static void main(String[] args) {
        Developer developer = new Developer("Developer", "IT", "Java");
        Pilot pilot = new Pilot("Pilot", "Aviation", "Boeing 737-800");
        Profession cppDeveloper = new Developer("Developer", "IT", "C++");
        Profession developer1 = new Developer("Developer", "IT", "Haskell");

        System.out.println(developer);
        System.out.println("=======================");
        System.out.println(pilot);
        System.out.println("=======================");
        System.out.println(cppDeveloper);
        System.out.println("=======================");
        System.out.println(developer1);
    }
}
