package ss20_solid._3_liskov_substitution_principle.wrong;

public class Animal {
    private String name;
    private Address address;

    public Animal() {
    }

    public Animal(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
