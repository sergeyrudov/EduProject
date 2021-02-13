import java.util.ArrayList;
import java.util.List;

public class TestCase {
    public static void main(String[] args) {
        String locatorValue = "Wall street";
        UserData ud1 = new UserData("Wall street", "143", 300023);
        UserData ud2 = new UserData("Mira street2", "24", 5674567);
        UserData ud3 = new UserData("Gagarina street", "15566", 5674566);


        List<UserData> userDataList = new ArrayList<>();
        userDataList.add(ud1);
        userDataList.add(ud2);
        userDataList.add(ud3);

        for (UserData s : userDataList) {
            if (locatorValue.equals(s.getAddress1()))
                System.out.println("OK");
        }
    }
}


class UserData{
     private String address1;
     private String address2;
     private int zipCode;

    public UserData(String address1, String address2, int zipCode) {
        this.address1 = address1;
        this.address2 = address2;
        this.zipCode = zipCode;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String toString() {
        return "primary address line: " + address1 +
                " secondary address line 2: " + address2 + "zip code: " + zipCode;
    }
}
