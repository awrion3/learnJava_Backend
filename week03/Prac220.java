package week03;
import java.util.Scanner;

public class Prac220 {
    public static void main(String[] args) {
        double salary, tax, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        salary = sc.nextDouble();

        Prac220b calc = new Prac220b();
        calc.setSalary(salary);
        calc.calcTax();
        tax = calc.getTax();
        result = salary - tax;

        System.out.printf("Your Salary is: %.2f\n", result);
    }
}
