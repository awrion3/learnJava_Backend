package CLO.N;

import java.util.Scanner;

public class N10869 {
    public static void main(String[] args) throws Exception {
        int A; int B;
        int S, D, M, Q, R;

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();

        S = A + B; D = A - B; M = A * B;
        Q = A / B; R = A % B;

        System.out.printf("%d\n%d\n%d\n%d\n%d", S, D, M, Q, R);
    }
}