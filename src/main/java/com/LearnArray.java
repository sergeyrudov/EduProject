package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LearnArray {
    public static void main(String[] args) {
        int a = 10;

        a = 15;

        //data_type[] name = new data_type[size];

        int[] array = new int[]{5, 8, 9};

        array[0] = 89;

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }


        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

//        Map<Integer, Map<Integer, String>> map = new HashMap<>();
        User[] users = new User[10];//null

        User john = new User("John", "One");
        User jack = new User("Jack", "Two");
        User ken = null;
//        ken = new User();

//        User[] users1 = {jack, john};

        users[0] = jack;
        users[1] = john;

        for (User user : users) {
            if (Objects.nonNull(user) && user.getFirstName().equals("John")) {
                user.setFirstName("Ken");

                System.out.println(user.getFirstName() + "\t" + user.getLastName());
            }

        }

    }
}

class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}