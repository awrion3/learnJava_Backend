package week07.prac106;
import java.lang.Math;

public class FirstClass {
    public double method_1(int x, int m, int c){
        return m * x + c;
    }
    public double method_2(int r){
        return 2 * Math.PI * r * r;
    }
    public double method_2(double r){   //method overloading
        return 2 * Math.PI * r * r;
    }
}
