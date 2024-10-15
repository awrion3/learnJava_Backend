package week07.prac107;
import java.lang.Math;

public class Data1 {
    protected double x;
    protected double y;

    public Data1() {}; //default constructor (inits to 0.0)
    public Data1(double x, double y) { //parameter constructor
        this.x = x;
        this.y = y;
    }

    public double Calculation(double y) {
        x = y * Math.pow(y, 3) * (y * Math.sqrt(y) + 1);
        return x;
    }
}