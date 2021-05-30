package two;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@ToString
public class RandomSelect {


    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(getState());
    }

    public static String getState() {

        return new ArrayList<>(Arrays.asList(
                "Alabama, United States of America",
                "Alaska, United States of America",
                "Arkansas, United States of America",
                "Arizona, United States of America",
                "California, United States of America"
        )).stream()
                .sorted((k1, k2) -> ThreadLocalRandom.current().nextInt(-1, 1))
                .findAny()
                .get();
    }
}

