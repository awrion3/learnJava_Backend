package week02;

import java.util.Scanner;

public class Prac121 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 0;
        while (i < N) {
            System.out.println(i++);
        }

        do {
            System.out.println("Once");
        } while (i > N);
    }
}