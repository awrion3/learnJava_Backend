package CLO.N;

import java.util.Scanner;

public class N2739 {
    public static void main(String[] args) throws Exception {
        int N;

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        for (int i = 1; i <= 9;i++){
            System.out.printf("%d * %d = %d\n", N, i, N * i);
        }
    }
}