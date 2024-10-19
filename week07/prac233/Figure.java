package week07.prac233;

public class Figure {
    double dim1, dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}