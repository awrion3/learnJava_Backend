package week06;

import java.util.Scanner;
import java.util.Random; //random utility

public class Email {
    //attributes
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;

    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companyDomain = "company.com";

    //constructor - parameter
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment(); //
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyDomain;
        //기본 패스워드 랜덤 생성
        this.password = randomPassword(defaultPasswordLength);
    }

    //method - get & set
    private String randomPassword(int length) {
        Random r = new Random(); //랜덤 비밀번호 생성

        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&?";
        String values = Capital_chars + Small_chars + numbers + symbols;

        String password = "";
        for (int i = 0; i < length; i++) { //values에서 랜덤 int 인덱스의 char 값을 패스워드 배열에 append
            password = password + values.charAt(r.nextInt(values.length()));
        }
        return  password;
    }

    private String setDepartment() {
        System.out.print("Department Codes\n1 For Sales\n2 for Development\n3 for Account\n0 for None\nEnter Department Code: ");
        Scanner scn = new Scanner(System.in);

        int depChoice = scn.nextInt();
        switch (depChoice) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "acc";
            case 0:
                return "";
        }
        return new String("***INVALID CHOICE***");
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }
    private void changePassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}

    public String getPassword() {return  password;}
    public String getEmail() {return email;}

    public String showInfo() {
        return "Display Name: " + firstName + lastName +
                "\nDepartment: " + this.department +
                "\nCompany Email: " + email +
                "\nCompany Email Password:" + this.password +
                "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}