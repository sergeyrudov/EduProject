package PPTest;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;


public class Demo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String primaryAddressLine1Value = "1815 NEAL TERRACE";

        String z = ",, 227 119,, ALIIOLANI ST";

        String a = z.replaceAll(",", "").trim();
        System.out.println(a);

        String v = "227 119 ALIIOLANI ST";

        System.out.println(a.equals(v));


        /*for (int i = 0; i < PersonalProfileDataList.result(primaryAddressLine1Value).size(); i++) {

            List<PersonalProfileDataList> list = new ArrayList<>(PersonalProfileDataList.result(primaryAddressLine1Value));
            System.out.println(list.get(i).getPrimaryAddressLine1());
        }*/

    }
}

