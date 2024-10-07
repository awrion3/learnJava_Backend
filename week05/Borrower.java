package week05;

public class Borrower extends Person { //extends from Person class
    private Loan loan;

    /** Construct a borrower with default properties */
    public Borrower() {
        super();
    }

    /** Create a borrower with specified name and address */
    public Borrower(Name name, Address address) {
        super(name, address);
    }

    /** Return loan */
    public Loan getLoan() {
        return loan;
    }

    /** Set a new loan */
    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    /** String representation for borrower */
    @Override
    public String toString() {
        return super.toString() + //super from Person class
                "Monthly payment is " + loan.getMonthlyPayment() + '\n' +
                "Total payment is " + loan.getTotalPayment();
    }

}