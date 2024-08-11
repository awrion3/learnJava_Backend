package CLO.B;

import java.util.Scanner;
import java.util.Arrays;

public class B3052 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N, flag, sum = 0;
        int[] arr = new int[10];
        Arrays.fill(arr, -1);   //특정 값으로 배열 초기화

        for (int i = 0; i < 10; i++){
            N = scan.nextInt();

            flag = 0;
            for (int j = 0; j < 10; j++){
                if (arr[j] % 42 == N % 42){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                for (int k = 0; k < 10; k++){
                    if (arr[k] == -1) {
                        arr[k] = N;
                        break;
                    }
                }
            }
        }

        for (int i = 0;  i < 10; i++) {
            if (arr[i] != -1)
                sum++;
        }
        System.out.println(sum);
    }
}