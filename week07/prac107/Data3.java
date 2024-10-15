package week07.prac107;

public class Data3 extends Data2 {

    public Data3() {}; //default constructor //needs to be public here
    public Data3(double x, double y) { //parameter constructor
        super.x = x;
        super.y = y;
    }

    public double Calculation(double y) {
        super.x = Math.pow(y, 2) * (Math.sqrt(y) + 10); //square root
        return super.x; //can just use x instead
    }
}