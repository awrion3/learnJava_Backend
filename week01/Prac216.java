package week01;
import java.util.Scanner;
import java.lang.String;

public class Prac216 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        int a1;
        float a2 = 5.22f; //f is needed
        double a3 = 5.22;
        char b1;
        String b2, b3;
        boolean b4;

        Scanner scan = new Scanner(System.in);
        a1 = scan.nextInt();
        a2 = scan.nextFloat();
        a3 = scan.nextDouble();
        //scan.next();    //
        b4 = scan.nextBoolean();
        b1 = scan.next().charAt(0);
        b2 = scan.next();          //until space
        b3 = scan.nextLine();      //until enter

        System.out.println("Java Input Results:");
        System.out.printf("Int: %d", a1);
        System.out.printf("Float: %f", a2);
        System.out.printf("Double: %f", a3);
        System.out.println("Char: " + b1);
        System.out.println("String1: " + b2);
        System.out.println("String2: " + b3);
        System.out.println("Boolean: " + b4);
    }
}
//var name cannot start with number or _