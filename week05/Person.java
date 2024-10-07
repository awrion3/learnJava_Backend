package week05;

public class Person {
    private Name name;
    private Address address;

    /** Construct a person with default properties */
    public Person() {
        this.name = new Name("Jill", 'S', "Barr");
        this.address = new Address("100 Main", "Savannah", "GA", "31411");
    }
    /** Construct a person with specified name and address */
    public Person(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    /** Return name */
    public Name getName() {
        return name;
    }

    /** Set a new name */
    public void setName(Name name) {
        this.name = name;
    }

    /** Return address */
    public Address getAddress() {
        return address;
    }

    /** Set a new address */
    public void setAddress(Address address) {
        this.address = address;
    }

    /** Override the toString method */
    @Override
    public String toString() {
        return '\n' + name.getFullName() + '\n' +
                address.getFullAddress() + '\n';
    }


}