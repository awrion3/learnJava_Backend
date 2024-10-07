package week04;

import java.util.Date;

public class Account {
    //data field
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    //constructor
    public Account(){ //no-args **not default https://sewoni.tistory.com/27
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    public Account(int id, double balance){ //parameter
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        annualInterestRate = 0;
    }

    //accessor and mutator
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public double getAnnualInterestRate() { return annualInterestRate; }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        Date startDate = dateCreated;
        return startDate;
    }

    //method: 연간 이윤에서 월간 이윤으로 환산 및 적용
    public double getMonthlyInterestRate() {
        double InterestRatePerMonth = annualInterestRate / 12;
        return InterestRatePerMonth;
    }
    public double getMonthlyInterest() {
        double monthlyInterestRate = balance * (this.getMonthlyInterestRate()) / 100;
        return monthlyInterestRate;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amountDeposit) {
        balance += amountDeposit;
    }

    @Override
    public String toString() {
        return "\nAccount ID: " + getId() + "\nBalance: " + getBalance()
                + "\nDateCreated: " + getDateCreated();
    }
}