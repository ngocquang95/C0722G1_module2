package ss20_solid._3_liskov_substitution_principle.wrong;

public class HomelessCat extends Animal {
    public HomelessCat(String name, Address address) {
        super(name, address);
    }
}
