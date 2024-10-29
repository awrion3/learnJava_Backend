package week09;

import java.util.Scanner;

public class Prac111 {
    public static int div(int number1, int number2) throws ArithmeticException {
        if (number2 == 0){
            throw new ArithmeticException("Error: Division by zero");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try{
            int result = div(number1,number2);
            System.out.println(number1 + "/" + number2 + "is" + result);
        } catch(Exception e) {
            System.out.println("Exception! an integer cannot be divided by zero!");
        }
        System.out.println("Execution continues...");
    }
}