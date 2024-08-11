package CLO.N;

import java.util.Scanner;

public class N2475 {
    public static void main(String[] args){
        int N;
        int R = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            N = scan.nextInt();
            R += N * N;
        }
        System.out.println(R % 10);
    }
}