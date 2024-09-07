package Week01;
import java.util.Scanner;
import java.lang.Math;

public class Prac04 {
    public static void main(String[] args) {
        //Arithmetic
        int a, b, e = 5;
        double res; //
        boolean c, d = true;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        res = Math.pow(a, 2) + (a * b) * 0.5;
        //Math.max(x, y), .min, .sqrt, .abs, .random..
        System.out.println(res);

        //Relational (Logical)
        c = a == b;
        System.out.println(c);
        //Assignment //Prefix, Postfix incre-/decrement a = 10; b = ++a; (11) b = a++; (10)
        res += 2;
        System.out.println(res);
        //Bitwise
        System.out.println(c & d);
        System.out.println(Integer.toBinaryString(~e)); //000...101
        e = e << 2;
        System.out.println(Integer.toBinaryString(e));
    }
}
