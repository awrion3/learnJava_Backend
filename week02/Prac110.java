package week02;

import java.util.Scanner;

public class Prac110 {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int num1, num2, num3, max;

     //find maximum number between three inputs
     System.out.println("Enter the first number: ");
     num1 = s.nextInt();
     System.out.println("Enter the second number: ");
     num2 = s.nextInt();
     System.out.println("Enter the third number: ");
     num3 = s.nextInt();

     max = num1;
     if (max <= num2) {
         max = num2;
     }
     if (max <= num3) {
         max = num3;
     }

     System.out.println(max);

     //conditional operator
     System.out.println(num1 > num2 ? num1 : num2);
     }
}