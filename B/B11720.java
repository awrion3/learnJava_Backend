package CLO.B;

import java.util.Scanner;

public class B11720 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N, sum = 0, T;
        String numStr;

        N = scan.nextInt();
        scan.nextLine(); //개행 문자 처리
        numStr = scan.nextLine();

        for (int i = 0; i < N; i++){
            T = numStr.charAt(i);
            sum += (T - '0');
        }

        System.out.println(sum);
    }
}