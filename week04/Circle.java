package week04;
import java.lang.Math;

public class Circle {
    //data fields
    private double radius;

    //constructor
    Circle() {
        radius = 1;
    }
    Circle(double r) {
        radius = r;
    }

    //methods
    public void setRadius(double r){
        radius = r; //after initialization
    }
    public double getRadius(){
       return radius; //accessor
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override //related to printing the object
    public String toString(){
        return "Circle[" +"radius=" + radius + "]";
    }
}