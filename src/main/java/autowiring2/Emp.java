package autowiring2;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
    private Address address;

    public Emp(Address address) {
        System.out.println("Inside Constructor");
        this.address = address;
    }

    public Emp() {
    }

    public Address getAddress() {
        System.out.println("Inside Address setter");
        return address;
    }

    public Emp setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
