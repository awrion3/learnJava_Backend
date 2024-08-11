package CLO.B;

import java.util.Scanner;

public class B2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, R, D;
        int [] arr = new int[10];

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();

        R = A * B * C;

        while (R != 0) {
            D = R % 10;
            if (D == 0)
                arr[0]++;
            else if (D == 1)
                arr[1]++;
            else if (D == 2)
                arr[2]++;
            else if (D == 3)
                arr[3]++;
            else if (D == 4)
                arr[4]++;
            else if (D == 5)
                arr[5]++;
            else if (D == 6)
                arr[6]++;
            else if (D == 7)
                arr[7]++;
            else if (D == 8)
                arr[8]++;
            else
                arr[9]++;
            R /= 10;
        }
        for (int i = 0; i < 10; i++){
            System.out.println(arr[i]);
        }
    }
}