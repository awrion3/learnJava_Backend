package week06;

import java.util.Scanner;

public class EmailMain {
    public static void main(String[] args) {
        //attribute
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String first = scn.next();  //공백 전까지
        System.out.print("Enter your Last Name: ");
        String last = scn.next();

        Email em1 = new Email(first, last); //System.out.println(em1.getEmail());
        System.out.println(em1.showInfo());
        //String currentPass = em1.getPassword(); 저장된 해당 이메일의 현재 비밃번호 출력
        System.out.println("For Login Please Enter Your Email");
        String currentEmail = scn.next();
        System.out.println("For Login Please Enter Your Password");
        String userPassword = scn.next();

        //간단한 로그인 시스템
        if(em1.getEmail().equals(currentEmail)) {
            if(em1.getPassword().equals(userPassword)) {
                System.out.println("You have logged in !!!");
            }
            else {
                System.out.println("Your password is wrong...");
            }
        }
        else {
            System.out.println("Your email is not valid...");
        }
    }
}