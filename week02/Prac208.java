package week02;
import java.util.Scanner;

public class Prac208 {
    public static void main(String[] args) {
        int A, B;

        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();

        System.out.println(A & B); //
        System.out.println(A | B);
        System.out.println(A ^ B);

    }
}
