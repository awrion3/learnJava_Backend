package CLO.B;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numStr = new int[9];
        int max = 0, idx = 0;

        for (int i = 0; i < 9; i++){
            numStr[i] = scan.nextInt();
            if (numStr[i] > max){
                max = numStr[i];
                idx = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}