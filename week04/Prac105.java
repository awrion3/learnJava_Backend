package week04;

public class Prac105 {
    public static void main(String[] args) {
        Rectangle rect0 = new Rectangle();
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 0");
        System.out.printf("Area: %.2f\n", rect0.getArea());
        System.out.printf("Perimeter: %.2f\n", rect0.getPerimeter());

        System.out.println("Rectangle 1");
        System.out.printf("Area: %.2f\n", rect1.getArea());
        System.out.printf("Perimeter: %.2f\n", rect1.getPerimeter());

        System.out.println("Rectangle 2");
        System.out.printf("Area: %.2f\n", rect2.getArea());
        System.out.printf("Perimeter: %.2f\n", rect2.getPerimeter());
    }
}
