package CLO.B;

import java.util.Scanner;

public class B2920 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int bef = 0, aft, flag = 0, ascd = 0, desc = 0;

        for (int i = 0; i < 8; i++){
            aft = scan.nextInt();
            if (flag == 0){
                bef = aft;
                flag = 1;
            }
            else{
                if (bef < aft) {
                    ascd = 1;
                }
                else if (bef > aft) {
                    desc = 1;
                }
                bef = aft;
            }
        }

        if (ascd == 1 && desc == 1) {
            System.out.println("mixed");
        }
        else {
            if (ascd == 1){
                System.out.println("ascending");
            }
            else{
                System.out.println("descending");
            }
        }
    }
}