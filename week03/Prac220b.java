package week03;

//SalaryTaxCalc
public class Prac220b {
    private double salary, tax;

    public void setSalary(double value){
        salary = value;
    }

    public double getSalary(){
        return salary;
    }

    public void calcTax(){
        tax = getSalary() * 0.15;
    }

    public double getTax(){
        return tax;
    }
}
