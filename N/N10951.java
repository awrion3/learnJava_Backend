package CLO.N;

import java.util.Scanner;

public class N10951 {
    public static void main(String[] args) {
        String input;
        String[] str; //java 방식의 문자열 배열 선언
        int A, B;
        int result;

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()){ //입력이 다음 라인에서 있는지만 확인
            input = scan.nextLine();
            str = input.split(" ");

            A = Integer.parseInt(str[0]);
            B = Integer.parseInt(str[1]);

            result = A + B;
            System.out.println(result);
        }
    }
}