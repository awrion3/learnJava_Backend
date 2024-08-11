package CLO.N;

import java.util.Scanner;

public class N1008 {
    public static void main(String[] args) throws Exception {
        int A; int B;
        double result;

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();

        result = (double)A / B;
        System.out.println(result);
    }
}