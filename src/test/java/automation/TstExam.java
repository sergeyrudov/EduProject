package automation;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TstExam {

   public static Map<String, Function<User, String>> calculateFunc = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        User user1 = new User("Vasya", "Pupkin", 18, true, new String[]{"English", "Russian"});
        User user2 = new User("Petya", "Ivanov", 55, true, new String[]{"French", "Spain"});
        User user3 = new User("Igor", "Fedorod", 33, true, new String[]{"Thai", "Russian"});
        User user4 = new User("Masha", "Kukushkina", 38, true, new String[]{"Hindi", "Chinese"});

        List<User> userList = Arrays.asList(user1, user2, user3, user4);

        calculateFunc.putIfAbsent("getName", User::getName);
        calculateFunc.putIfAbsent("getSurname", User::getSurname);
        calculateFunc.putIfAbsent("getAge", u -> String.valueOf(user1.getAge()));
        calculateFunc.putIfAbsent("getDriverLicense", u -> String.valueOf(user1.isDriverLicense()));


        calculateFunc.putIfAbsent("getLanguages", u -> Arrays.toString(user1.getLanguages()));


        List<String> newList = new ArrayList<>();


        userList.stream()
                .map(u -> calculateFunc.get("getLanguages").apply(u) + " "
                        + calculateFunc.get("getName").apply(u) + " "
                        + calculateFunc.get("getSurname").apply(u) + " "
                        + calculateFunc.get("getAge").apply(u)).map(StringUtils::capitalize)
                .collect(Collectors.toCollection(() -> newList));

        newList.forEach(System.out::println);


    }






    @Test
    void checkNumbers() {
        assertEquals(1, 3);
        System.out.print("Test");
        assertEquals(1, 2);
    }


    public static class User {
        public String name;
        public String surname;
        public int age;
        public boolean driverLicense;
        public String[] languages;

        public User(String name, String surname, int age, boolean driverLicense, String[] languages) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.driverLicense = driverLicense;
            this.languages = languages;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isDriverLicense() {
            return driverLicense;
        }

        public void setDriverLicense(boolean driverLicense) {
            this.driverLicense = driverLicense;
        }

        public String[] getLanguages() {
            return languages;
        }

        public void setLanguages(String[] languages) {
            this.languages = languages;
        }
    }
}
