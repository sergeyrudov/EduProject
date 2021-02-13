package RegularExpression;

public class PrintfAndFormat {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Petr", "Ivanov", 12345, 0.15);
        Employee emp2 = new Employee(2, "Ivan", "Sidorov", 5634, 0.33);
        Employee emp3 = new Employee(3, "Mariya", "Petrova", 1953, 0.21);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        System.out.println("------------------------------------------------------------------------");

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f ",
                1, "Petr", "Ivanov", 12345*(1+0.15));

        System.out.println(newString);

    }

    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
                emp.id, emp.name, emp.surname, emp.salary*(1+ emp.bonusPct));
    }
}


class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }


}