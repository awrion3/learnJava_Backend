package week02;
import java.util.Scanner;

public class Prac217 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fac = 1;

        while(n > 0) {
            fac *= n;
            n--;
        }
        System.out.println(fac);
    }
}
