package week05;

public class Name {
    //attributes
    private String firstName;
    private char mi;
    private String lastName;

    //constructor-parameter //no return value not even void
    public Name(String firstName, char mi, String lastName) {
        this.firstName = firstName;
        this.mi = mi;
        this.lastName = lastName;
    }
    //methods - getter to return values
    public String getFirstName() {
        return firstName;
    }
    public char getMi() {
        return mi;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName + " " + mi + " " + lastName;
    }
}
