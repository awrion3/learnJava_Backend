package week02;
import java.util.Scanner;
import java.lang.Math;

public class Prac210 {
    public static void main(String[] args) {
        double s, r;
        Scanner scan = new Scanner(System.in);
        s = scan.nextDouble();

        r = (6 * s * s) / (4 * Math.tan(Math.PI / 6));
        System.out.println(r);

        scan.close(); //
    }
}
