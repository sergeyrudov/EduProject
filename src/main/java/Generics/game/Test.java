package Generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);



        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Vasiliy", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Drakoni");
        Team<Schoolar> schoolarTeam2 = new Team<>("Wisdom");

        Schoolar schoolar3 = new Schoolar("Petr", 12);
        Schoolar schoolar4 = new Schoolar("Alina", 14);

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);



        // students cannot be added to school team

        /*schoolarTeam.addNewParticipant(student1);
        schoolarTeam.addNewParticipant(student2);*/


        Team<Student> studentTeam = new Team<>("Grifoni");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);


        Team<Employee> employeeTeam = new Team<>("Employees team!");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        // Team can be only with type which extended by Participant
        // error Team<String> anotherTeam = new Team<String>("Dream");

        // school team can play only with school team, employee only with employee teams, etc.
        // error schoolarTeam.playWith(employeeTeam);

    }
}
