package week07.prac233;

public class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);  //init member variables of super class
    }

    @Override
    double area() {
        System.out.println("Area of Triangle:");
        return this.dim1 * this.dim2 * 0.5;
    }
}