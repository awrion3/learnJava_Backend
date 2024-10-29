package week09;

import java.util.Scanner;

class MissingNameException extends Exception { //from exception class
    MissingNameException() {
        super("Name is blank!");
    }
}

public class Prac123 {
    public static void main(String[] args) throws MissingNameException {
        boolean isValidName = false;
        String name = "";
        Scanner scanner = new Scanner(System.in);

        while (!isValidName) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

            if (name.length()<=0)
            {
                throw new MissingNameException();
            }
            isValidName = true;
        }
        System.out.println("Hello, " + name);
    }
}