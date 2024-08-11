package CLO.N;

import java.util.Scanner;

public class N2741 {
    public static void main(String[] args) {
        int L;

        Scanner scan = new Scanner(System.in);

        L = scan.nextInt();
        scan.close();   //OS 자원 반환

        for (int i = 1; i <= L; i++) {
            System.out.println(i);
        }
    }
}