package CLO.B;

import java.util.Scanner;

public class B1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;
        String str;
        String[] st;

        str = scan.nextLine();
        st = str.split(" ");

        for (String s : st) { //향상된 for문
            if (!s.equals("")) {
                num++;
            }
        }
        System.out.println(num);
    }
}