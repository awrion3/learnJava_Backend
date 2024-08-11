package CLO.B;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H, M, T;

        H = scan.nextInt();
        M = scan.nextInt();

        T = H * 60 + M;
        T -= 45;

        if (T < 0)
            T += 24 * 60;

        H = T / 60;
        M = T % 60;

        System.out.printf("%d %d", H, M);
    }
}