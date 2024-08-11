package CLO.N;

import java.util.Scanner;
import java.util.ArrayList;

public class N10871 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>(); //동적 배열
        int N, X, T;

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        X = scan.nextInt();

        for (int i = 0; i < N; i++){
            T = scan.nextInt();
            list.add(T);
            if (T < X)
                System.out.printf("%d ", list.get(i));
        }
    }
}