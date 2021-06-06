package two;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class demo {
    public static void main(String[] args) {
        st1 user1 = new st1("Kolya");
        st1 user2 = new st1("Kolya");

        System.out.println(user1.name.equals(user2.name));
    }


}



@Getter
@AllArgsConstructor
class st1 {
    String name;
}
