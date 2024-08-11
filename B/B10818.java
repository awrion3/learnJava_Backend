package CLO.B;

import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        int N, num, max = 0, min = 0, fl = 0;

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        for (int i = 0; i < N; i++)
        {
            num = scan.nextInt();

            if (fl == 0)
            {
                max = num;
                min = num;
                fl = 1;
            }

            if (max < num){
                max = num;
            }
            if (min > num){
                min = num;
            }
        }
        System.out.printf("%d %d", min, max);
    }
}