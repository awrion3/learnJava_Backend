package week01;
import java.util.Scanner;

public class Prac236 {
    public static void main(String[] args) {
        //Statement
        int grade;
        Scanner s = new Scanner(System.in);
        grade = s.nextInt();

        if (grade >= 60) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Not Passed");
        }
    }
}
