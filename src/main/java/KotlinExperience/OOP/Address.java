package KotlinExperience.OOP;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int numberOfHouse;

    public Address(String city, String street, int numberOfHouse) {
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Address) {
            Address address = (Address) o;
            if(this.city.equals(address.city) && this.street.equals(address.street) && this.numberOfHouse == address.numberOfHouse) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

class Demo {
    public static void main(String[] args) {
        Address address1 = new Address("Kiev", "green", 221);
        Address address2 = new Address("Kiev", "green", 221);
        if(address1.equals(address2)) {
            System.out.println("Equals");
        } else {
            System.out.println("not equals");
        }
    }
}
