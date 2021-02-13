import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class FakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String address = faker.address().secondaryAddress();
        String city = faker.address().city();
        String phone = faker.phoneNumber().phoneNumber();
        String phon1 = faker.phoneNumber().cellPhone();
        String state = faker.address().state();
        System.out.println(state);

        List<String> addr = new ArrayList<>();
        addr.add(address);
        addr.add(city);
        addr.add(phone);
        addr.add(phon1);

        for (String s: addr
             ) {
            System.out.println(s);
        }
    }
}
