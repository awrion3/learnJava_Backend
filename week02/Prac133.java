package week02;
import java.util.Scanner;

public class Prac133 {
    public static int increment(int n){
        n++;
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        x = increment(x);
        System.out.println(x);
    }
}
