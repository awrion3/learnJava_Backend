package week04;

public class Rectangle {
    //data fields
    public double width, height;

    //constructors
    Rectangle() { //this is not default, it's no-arg
        width = 1;
        height = 1;
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //methods
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width * 2 + height * 2;
    }
}