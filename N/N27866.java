package CLO.N;

import java.util.Scanner;

public class N27866 {
    public static void main(String[] args) throws Exception {
        String word;
        int index;

        Scanner scan = new Scanner(System.in);

        word = scan.nextLine();
        index = scan.nextInt();

        System.out.println(word.charAt(index-1));
    }
}