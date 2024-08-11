package CLO.B;

import java.util.Scanner;

public class B8958 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N, sum, cnt;
        String st;
        char bef = 0, aft;

        N = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < N; i++)
        {
            st = scan.nextLine();
            sum = 0; cnt = 0;

            for (int j = 0; j < st.length(); j++){
                if (j == 0){
                    bef = st.charAt(j);
                    if (bef == 'O')
                        cnt = 1;
                    sum += cnt;
                }
                else {
                    aft = st.charAt(j);
                    if (aft == 'O') {
                        if (bef == aft)
                            cnt++;
                        else
                            cnt = 1;
                        sum += cnt;
                    }
                    else {
                        cnt = 0;
                    }
                    bef = aft;
                }
            }
            System.out.println(sum);
        }
    }
}