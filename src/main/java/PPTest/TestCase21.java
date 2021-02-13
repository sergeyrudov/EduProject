package PPTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongUnaryOperator;

public class TestCase21 {
    public static void main(String[] args) {
        // in this case c
        //System.out.println(verifyData(prepareData1(), "Mira street2"));
        fill();
    }

    public static List<UserData1> prepareData1() {
        UserData1 ud1 = new UserData1("Wall street", "143", 300023);
        UserData1 ud2 = new UserData1("Mira street2", "24", 5674567);
        UserData1 ud3 = new UserData1("Gagarina street", "15566", 5674566);


        List<UserData1> userDataList1 = new ArrayList<>();
        userDataList1.add(ud1);
        userDataList1.add(ud2);
        userDataList1.add(ud3);
        return userDataList1;
    }

    public static boolean verifyData(List<UserData1> list, String locatorValue) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAddress1().equals(locatorValue)) {
                return false;
            }
        }
        return true;
    }

    public static void fill() {
        if (verifyData(prepareData1(), "Wall street")) {
            System.out.println("OK i can fill data");
        } else {
            System.out.println("input new data");
        }
    }
}


class UserData1 {
    String address1;
    String address2;
    int zipCode;

    public UserData1(String address1, String address2, int zipCode) {
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
