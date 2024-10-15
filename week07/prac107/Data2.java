package week07.prac107;
//no need to import, inherit from super class
public class Data2 extends Data1 {

    public Data2() {}; //default constructor
    public Data2(double x, double y) { //parameter constructor
        super.x = x;   //can use this. instead
        super.y = y;
    }

    public double Calculation(double y) {
        super.x = 20 * Math.pow(y, 2) * (Math.sqrt(y) + 1);
        return super.x;
    }
}
