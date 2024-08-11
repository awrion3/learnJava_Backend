package CLO.B;

import java.util.Scanner;

public class B2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T, I;
        String R, B;
        String [] Q;

        T = scan.nextInt();
        B = scan.nextLine();

        for (int i = 0; i < T; i++){
            R = scan.nextLine();

            I = R.charAt(0) - '0';
            Q = R.split(" ");

            for (int k = 0; k < Q[1].length(); k++)
            {
                for (int j = 0; j < I; j++)
                    System.out.print(Q[1].charAt(k));
            }
            System.out.println();
        }
    }
}