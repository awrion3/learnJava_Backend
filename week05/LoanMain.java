package week05;
import javax.swing.JOptionPane;

public class LoanMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Name name = new Name("John", 'D', "Smith");

        // Create an address
        Address address = new Address("100 Main Street", "Savannah",
                "GA", "31419");

        // Create a loan
        Loan loan = new Loan(5.5, 15, 250000);

        // Create a borrower
        Borrower borrower = new Borrower(name, address);

        borrower.setLoan(loan);

        // Display loan information //Panel interface
        JOptionPane.showMessageDialog(null, borrower.toString());
    }
}
