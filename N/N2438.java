package CLO.N;

import java.util.Scanner;

public class N2438 {
    public static void main(String[] args) {
        int L;

        Scanner scan = new Scanner(System.in);

        L = scan.nextInt();

        for (int i = 0; i < L; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}