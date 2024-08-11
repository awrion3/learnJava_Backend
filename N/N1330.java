package CLO.N;

import java.util.Scanner;

public class N1330 {
    public static void main(String[] args) throws Exception {
        int A; int B;

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();

        if (A < B){
            System.out.println("<");
        }
        else if (A > B) {
            System.out.println(">");
        }
        else {
            System.out.println("==");
        }
    }
}