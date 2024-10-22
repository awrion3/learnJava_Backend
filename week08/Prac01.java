package week08;

import java.lang.Math;
public class Prac01 {
    public static void main(String[] args) {
        //variable
        int b = 10;
        char a = 'b';
        float c = 22.5F;
        double d = 22.65;
        String e = "Java";
        System.out.println("e = " + e);

        //operation; +,-,*,/,%
        int num1 = 10, num2 = 20;
        System.out.println("sum = " + num1+num2); //not 30
        System.out.println("div = " + num1/num2);
        System.out.println("mod = " + num1%num2);
        System.out.println(Math.PI);
        //Math.pow(base, exp)

        //conditional; relational
        if (num1 <= num2){
            System.out.println("num1 <= num2");
        }
        else{
            System.out.println("num1 > num2");
        }
        //logical: OR || AND && NOT ! //bitwise: | & ^ >> << ~
        int val = (10 < 5) ? 10 : 5; //conditional operator
        System.out.println("val = " + val);

        //loops
        for (int i = 0; i < 1; i++){ //init, cond, body, incre/dcre
            System.out.println("i = " + i);
        }
        int j = 0;
        while (true){
            if (j < 1){
                break; //break; finish
                //continue; ignores (breaks iteration block once)
            }
            System.out.println("j = " + j);
            j += 1;
        }
        do {
            System.out.println("j = " + j);
            j += 1; //execs block at least once
        }while(j < 2);
        //nested if else, for, whlie, do while
        //java exec flow: dev java code compiler class JVM
        //widening, narrowing casting
        double myData = 10.55;
        System.out.println("myData = " + (int) myData);

        //return statement
        if (val == 100){
            return;
        }
    }
}
