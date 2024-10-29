package week09;

import java.util.Scanner;

public class Prac132 {
    public static void main(String[] args) {
        // Array index out of bounds exception example
        int [] arr  = new int[100];
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer index: ");
            int index = input.nextInt(); //if number >= 100 cause error

            System.out.print("Enter an integer data: ");
            int data = input.nextInt();

            arr[index] = data;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Incorrect index input!");
        }
    }
}
