package CLO.N; //패키지 이름

import java.util.Scanner; //util 패키지

public class N1000 { //클래스 이름 //백준에서는 class Main 사용
    public static void main(String[] args) throws Exception { //메소드 이름
        int A; int B;
        int result;

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();

        result = A + B; //N1001 - //N10998 *
        System.out.println(result);
    }
}