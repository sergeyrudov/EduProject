package someCases;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@AllArgsConstructor
@ToString
enum Occupation {
    CEO("CEO"),
    DEVELOPER("Developer"),
    CLEANING_LADY("Cleaning_lady");
    private final String occupation;
}

@Getter
@AllArgsConstructor
class Person {
    String name;
    int age;
    Occupation occupation;
}

@Getter
@AllArgsConstructor
@ToString
class Student {
    String name;
    String surname;
    int age;
}



public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        List<Person> team = Arrays.asList(
                new Person("Nikita", 21, Occupation.CEO),
                new Person("Ruslan", 22, Occupation.CEO),
                new Person("Dyadya Vanya", 60, Occupation.CLEANING_LADY),
                new Person("Bob Martin", 46, Occupation.DEVELOPER),
                new Person("Fred Brooks", 47, Occupation.DEVELOPER),
                new Person("Maks", 21, Occupation.CEO)

        );


        Object t1 = team.stream().filter(i -> i.getAge()>30).count();

        System.out.println("Quantity of CEO is: " + team.stream().filter(i -> i.occupation.equals(Occupation.CEO)).count());

        System.out.println("Max age in team is: " + team.stream().mapToInt(i -> i.age).max().orElseThrow(NoSuchElementException::new));

        Integer numbers[] = {1, 2, 5, 3, 5, 2, 1, 1, 4, 7, 3, 2};

        System.out.println("Duplicate removed " + Arrays.stream(numbers).distinct().collect(Collectors.toList()));

        int num = 12345;
        System.out.printf("----------Before reverse-[%s]-----And after reverse-[%s]-------------\n", num, reversInt(num));



        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Peter", "Patterson", 21));
        studentList.add(new Student("Paul", "Walker", 31));
        studentList.add(new Student("Steve", "Runner", 41));
        studentList.add(new Student("Arnold", "", -1));
        studentList.add(new Student(" ", "Stevenson", 19));
        studentList.add(new Student("Arnold", "Stevenson", 19));
        studentList.add(null);

        List<String> strings = studentList.stream()
                .filter(Objects::nonNull)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("filter nullable values: " + strings);

        System.out.println("filter empty values, to uppercase, remove duplicate: " + strings.stream()
                .filter(Predicate.not(String::isBlank))
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList()));

        System.out.println(strings.stream()
        .filter(Predicate.not(String::isBlank)));



        String[] l1 = {"White", "Black", "Red"};
        String[] l2 = {"Red", "Green"};

        System.out.println(l1);

        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {2, 4, 6, 8};
        IntStream.range(0,a1.length)
                .filter(i -> IntStream.range(0,a2.length).filter(j -> (a1[i] == a2[j])).count() == 0)
                .forEach(i -> System.out.println("a1["+i+"]="+a1[i]));
    }





    static int reversInt(int num) {
        int reversNumber = 0;
        while (num > 0) {
            reversNumber = reversNumber * 10 + num % 10;
            num = num / 10;
        }
        return reversNumber;
    }
}





/*// task 1 - get number of CEOs
        Long ceo_num =null;
        System.out.println("We have " + ceo_num + " CEOs running the business!");
// task 2 - get max age in team
        Integer max_age = null;
        System.out.println("\nThe oldest person in team is only " + max_age);

// task 3 - get all team members per position, except CEO
        Map<Occupation, List<Person>> positions =  Map.of();
        positions.forEach((occupation, team_members) -> System.out.println(occupation + ": " + team_members));


// Удалить из списка все дублирующиеся значения (оставить только уникальные)
        Integer numbers[] = {1,2,5,3,5,2,1,1,4,7,3,2};
        System.out.println("\nУникальные значения "+uniqueNumbers);
// Сделать реверс числа (из 12345 в 54321)  num = 12345
        int num = 12345;
        System.out.println("\nРеверс числа 12345 = "+num);
// Скопировать структуру из d1 в d2.
//    d1 = {"data": {"number": 1}}
//    d2 =

//  Выведите все елементы первого списка, которых нет во втором
        String[] l1 = {"White", "Black", "Red"};
        String[] l2 = {"Red", "Green"};
        List<String> resultArray = ;
        System.out.println("\nEлементы первого списка, которых нет во втором "+resultArray);
        //Отсортировать список словарей по ключу 'x'
        //    l = [{"x": 4}, {"x": 2}, {"x": 1}, {"x": 3}]

        public class HelloWorld{
            public static void main(String []args){
                List<Person> personList = new ArrayList<>();
                personList.add(new Person("Peter", "Patterson", 21));
                personList.add(new Person("Paul", "Walker", 31));
                personList.add(new Person("Steve", "Runner", 41));
                personList.add(new Person("Arnold", "", -1));
                personList.add(new Person(" ", "Stevenson", 19));
                personList.add(new Person("Arnold", "Stevenson", 19));
                personList.add(null);
// **** //
                personList.add(new Person("Aaron", "Bortnicker", 18));
            }
        }
//Вывести все уникальные имена из листа, результат должен быть в апперкейсе. пример: ["PETER","PAUL","STEVE"]
}*/
