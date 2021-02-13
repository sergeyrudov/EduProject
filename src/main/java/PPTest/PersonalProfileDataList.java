package PPTest;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonalProfileDataList {
    // this is helper class, to create personal profile data, and return in randomly, for further filling in PersonalProfileEditTest

    private String primaryAddressLine1;
    private String primaryAddressLine2;
    private String primaryAddressCity;
    private String primaryAddressState;
    private String primaryAddressZip;
    private String mailingAddressLine1;
    private String mailingAddressLine2;
    private String mailingAddressCity;
    private String mailingAddressState;
    private String mailingAddressZip;
    private String mobilePhoneNumber;
    private String homePhoneNumber;
    private String workPhoneNumber;
    private String extensionNumber;
    private String email;

    public void setPrimaryAddressLine1(String primaryAddressLine1) {
        this.primaryAddressLine1 = primaryAddressLine1;
    }
    public void setPrimaryAddressLine2(String primaryAddressLine2) {
        this.primaryAddressLine2 = primaryAddressLine2;
    }
    public void setPrimaryAddressCity(String primaryAddressCity) {
        this.primaryAddressCity = primaryAddressCity;
    }
    public void setPrimaryAddressState(String primaryAddressState) {
        this.primaryAddressState = primaryAddressState;
    }
    public void setPrimaryAddressZip(String primaryAddressZip) {
        this.primaryAddressZip = primaryAddressZip;
    }
    public void setMailingAddressLine1(String mailingAddressLine1) {
        this.mailingAddressLine1 = mailingAddressLine1;
    }
    public void setMailingAddressLine2(String mailingAddressLine2) {
        this.mailingAddressLine2 = mailingAddressLine2;
    }
    public void setMailingAddressCity(String mailingAddressCity) {
        this.mailingAddressCity = mailingAddressCity;
    }
    public void setMailingAddressState(String mailingAddressState) {
        this.mailingAddressState = mailingAddressState;
    }
    public void setMailingAddressZip(String mailingAddressZip) {
        this.mailingAddressZip = mailingAddressZip;
    }
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }
    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }
    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPrimaryAddressLine1() { return primaryAddressLine1; }
    public String getPrimaryAddressLine2() {
        return primaryAddressLine2;
    }
    public String getPrimaryAddressCity() {
        return primaryAddressCity;
    }
    public String getPrimaryAddressState() {
        return primaryAddressState;
    }
    public String getPrimaryAddressZip() {
        return primaryAddressZip;
    }
    public String getMailingAddressLine1() {
        return mailingAddressLine1;
    }
    public String getMailingAddressLine2() {
        return mailingAddressLine2;
    }
    public String getMailingAddressCity() {
        return mailingAddressCity;
    }
    public String getMailingAddressState() {
        return mailingAddressState;
    }
    public String getMailingAddressZip() {
        return mailingAddressZip;
    }
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }
    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }
    public String getWorkPhoneNumber() { return workPhoneNumber; }
    public String getExtensionNumber() {
        return extensionNumber;
    }
    public String getEmail() { return email; }


    /**
     *
     * @param valueFromPrimaryAddressLine1 which received string value from MFM Primary address line 1
     * @return array, which was randomly selected from array list in getAddressList method
     * @throws NoSuchAlgorithmException
     */
    public static List<PersonalProfileDataList> result(String valueFromPrimaryAddressLine1) throws NoSuchAlgorithmException {
        Random random = SecureRandom.getInstanceStrong();
        int randomAddressIndex = random.nextInt(PersonalProfileDataList.getAddressList().size());

        List<PersonalProfileDataList> o = new ArrayList<>();
        for (int i = 0; i < PersonalProfileDataList.getAddressList().size(); i++) {

            if (PersonalProfileDataList.getAddressList().get(i).getPrimaryAddressLine1().equals(valueFromPrimaryAddressLine1)) {
                if (randomAddressIndex == i) {
                    return result(valueFromPrimaryAddressLine1);
                } else {
                    o.add(PersonalProfileDataList.getAddressList().get(randomAddressIndex));
                }
                return o;
            }
        }
        return o;
    }


    public static List<PersonalProfileDataList> getAddressList() {
        List<PersonalProfileDataList> addresses = new ArrayList<>();

        PersonalProfileDataList list1 = new PersonalProfileDataList();
        PersonalProfileDataList list2 = new PersonalProfileDataList();
        PersonalProfileDataList list3 = new PersonalProfileDataList();

        addresses.add(list1);
        addresses.add(list2);
        addresses.add(list3);

        list1.setPrimaryAddressLine1("1815 NEAL TERRACE");
        list1.setPrimaryAddressLine2("APPARTMENT 211");
        list1.setPrimaryAddressCity("NASHVILLE");
        list1.setPrimaryAddressState("TN - Tennessee");
        list1.setPrimaryAddressZip("37210");
        list1.setMailingAddressLine1("2001-2021 ROSEMARY LN 1");
        list1.setMailingAddressLine2("2001-2021 ROSEMARY LN 2");
        list1.setMailingAddressCity("NASHVILLE");
        list1.setMailingAddressState("TN - Tennessee");
        list1.setMailingAddressZip("37210");
        list1.setMobilePhoneNumber("555-666-7788");
        list1.setHomePhoneNumber("555-666-7789");
        list1.setWorkPhoneNumber("555-666-7780");
        list1.setExtensionNumber("666677");

        list2.setPrimaryAddressLine1("227-119 ALIIOLANI ST");
        list2.setPrimaryAddressLine2("APPT 199");
        list2.setPrimaryAddressCity("MAKAWAO");
        list2.setPrimaryAddressState("HI - Hawaii");
        list2.setPrimaryAddressZip("96768");
        list2.setMailingAddressLine1("68 AUHILI LOOP");
        list2.setMailingAddressLine2("PO 553");
        list2.setMailingAddressCity("WAIKOLOA VILLAGE");
        list2.setMailingAddressState("HI - Hawaii");
        list2.setMailingAddressZip("96738");
        list2.setMobilePhoneNumber("566-677-8899");
        list2.setHomePhoneNumber("544-565-6678");
        list2.setWorkPhoneNumber("522-396-4568");
        list2.setExtensionNumber("234477");

        list3.setPrimaryAddressLine1("1017 5TH ST5");
        list3.setPrimaryAddressLine2("NEW WAY 2");
        list3.setPrimaryAddressCity("ALBUQUERQUE");
        list3.setPrimaryAddressState("NM - New Mexico");
        list3.setPrimaryAddressZip("87102");
        list3.setMailingAddressLine1("2245 13TH");
        list3.setMailingAddressLine2("STREET NEW WAY 13");
        list3.setMailingAddressCity("WASHINGTON");
        list3.setMailingAddressState("DC - District of Columbia");
        list3.setMailingAddressZip("20009");
        list3.setMobilePhoneNumber("590-546-5756");
        list3.setHomePhoneNumber("599-222-9999");
        list3.setWorkPhoneNumber("573-986-7788");
        list3.setExtensionNumber("567777");

        return addresses;
    }
}
