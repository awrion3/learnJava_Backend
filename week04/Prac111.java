package week04;

public class Prac111 {
    public static void main(String[] args) {
        Account myAccount = new Account(1122, 20_000); //20,000과 똑같음

        myAccount.setAnnualInterestRate(4.5);
        myAccount.withdraw(2500);
        myAccount.deposit(3000);

        System.out.println("Account created on " + myAccount.getId());
        System.out.println("The balance of account " + myAccount.getId() + " is " + myAccount.getBalance());
        System.out.println("The total interest at a rate of " + myAccount.getMonthlyInterestRate() + "%");
        System.out.println("Interest per month is " + myAccount.getMonthlyInterest());
    }
}
