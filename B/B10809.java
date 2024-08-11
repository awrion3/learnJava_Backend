package CLO.B;

import java.util.Scanner;
import java.util.Arrays;

public class B10809 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int K = 'z' - 'a' + 1;
        int [] arr = new int[K];
        Arrays.fill(arr, -1);

        char ch;
        for (int i = 0; i < word.length(); i++)
        {
            ch = word.charAt(i);
            if (arr[ch - 'a'] == -1)
                arr[ch - 'a'] = i;
        }

        for (int i = 0; i < K; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}