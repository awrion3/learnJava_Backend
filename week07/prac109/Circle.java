package week07.prac109;
import java.lang.Math;

public class Circle extends GeometricObject{
    //member
    private double radius;

    //constructor
    public Circle(){}   //default class
    public Circle(double radius) {}

    //getter and setter method
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() { return Math.PI * radius * radius; }

    public double getDiameter() { return 2 * radius; }

    public double getPerimeter() { return 2 * Math.PI * radius; }

    public void printCircle() { //inherits from GeometricObject class
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}