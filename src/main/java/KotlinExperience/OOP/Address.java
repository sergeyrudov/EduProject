package KotlinExperience.OOP;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address {
    private String city;
    private String street;
    private int numberOfHouse;

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(hashCode() != o.hashCode()) {
            return false;
        }
        if (o instanceof Address) {
            Address address = (Address) o;
            if (this.city.equals(address.city) && this.street.equals(address.street) && this.numberOfHouse == address.numberOfHouse) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return city.hashCode() + street.hashCode() + numberOfHouse;
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
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }
}
