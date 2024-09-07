package Week01;
import java.util.Scanner;

public class Prac02 {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        System.out.printf("a: %d, b: %d\n", a, b);

        temp = a;
        a = b;
        b = temp;

        System.out.printf("a: %d, b: %d\n", a, b);
    }
}
