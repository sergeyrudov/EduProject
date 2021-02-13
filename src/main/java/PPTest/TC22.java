
package PPTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TC22 {
    static String locator = "Wall street";

    public static void main(String[] args) {
        // in this case c
        //System.out.println(verifyData(prepareData1(), "Mira street2"));
        System.out.println(fill());
        //fill();

    }

    public static List<UserData2> prepareData2() {
        UserData2 ud1 = new UserData2("Wall street", "143", 300023);
        UserData2 ud2 = new UserData2("Mira street2", "24", 5674567);
        UserData2 ud3 = new UserData2("Gagarina street", "15566", 5674566);


        List<UserData2> userDataList2 = new ArrayList<>();
        userDataList2.add(ud1);
        userDataList2.add(ud2);
        userDataList2.add(ud3);
        return userDataList2;
    }

    /*public static boolean verifyData(List<UserData2> list) {
        for (UserData2 userData2 : list) {
            if (userData2.getAddress1().equals(locator)) {
                return false;
            }
        }
        return true;
    }*/

    public static List<Object> fill() {
        Random random = new Random();
        List<Object> o = new ArrayList<>();

        int c = random.nextInt(prepareData2().size());

        for (int i = 0; i < prepareData2().size(); i++) {

            if (!locator.equals(prepareData2().get(i).getAddress1())) {

                o.add(prepareData2().get(i).getAddress1());
                return o;
            } else {
                o.add(prepareData2().get(c).getAddress1());
            }
        }System.out.println("2");
        return o;
    }
}



    class UserData2 {
        String address1;
        String address2;
        int zipCode;

        public UserData2(String address1, String address2, int zipCode) {
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


