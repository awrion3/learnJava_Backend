package CLO.N;

import java.util.Scanner;

public class N10950 {
    public static void main(String[] args) throws Exception {
        int T;
        int A; int B;
        int result;

        Scanner input = new Scanner(System.in);

        T = input.nextInt();

        for(int i = 0; i < T; i++) {

            A = input.nextInt();
            B = input.nextInt();

            result = A + B;
            System.out.println(result);
        }
    }
}