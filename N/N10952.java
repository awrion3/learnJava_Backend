package CLO.N;

import java.util.Scanner;

public class N10952 {
    public static void main(String[] args) {
        int A, B;
        int result;

        Scanner scan = new Scanner(System.in);

        do {
            A = scan.nextInt();
            B = scan.nextInt();

            if (A == 0 && B == 0)
                break;

            result = A + B;
            System.out.println(result);
        } while (true);
    }
}