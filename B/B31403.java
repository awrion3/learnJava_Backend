package CLO.B;

import java.util.Scanner;

public class B31403 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A, B, C, D;
        int a, b, c, d;

        A = scan.nextLine();
        B = scan.nextLine();
        C = scan.nextLine();

        a = Integer.parseInt(A);
        b = Integer.parseInt(B);
        c = Integer.parseInt(C);

        D = A + B;
        d = Integer.parseInt(D);
        System.out.println(a + b - c);
        System.out.println(d - c);
    }
}