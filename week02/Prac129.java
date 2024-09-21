package week02;

import java.util.Scanner;

public class Prac129 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (true) {
            if (n == 5)
                break;
            n++;
            if (n % 2 == 0)
                continue;
            System.out.println(n);
        }
    }
}
