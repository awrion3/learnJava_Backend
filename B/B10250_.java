package CLO.B;

import java.util.Scanner;

public class B10250_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T, H, W, N;
        int h;

        T = scan.nextInt();

        for (int i = 0; i < T; i++)
        {
            H = scan.nextInt();
            W = scan.nextInt();
            N = scan.nextInt();

            h = N % H;
            W = N / H + 1;

            if (h == 0) {
                h = H;
                W--;
            }

            System.out.printf("%d", h);
            System.out.printf("%02d\n", W);
        }
    }
}