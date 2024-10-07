package week04;

public class Prac107 {
    public static void main(String[] args) {
        Circle cir0 = new Circle();
        Circle cir1 = new Circle(2);
        Circle cir2 = new Circle(3.7);

        System.out.println("Cir 0");
        System.out.println(cir0); //override applied automatically
        System.out.printf("Area: %.2f\n", cir0.getArea());
        System.out.printf("Circumference: %.2f\n", cir0.getCircumference());

        System.out.println("Cir 1");
        System.out.println(cir1);
        System.out.printf("Area: %.2f\n", cir1.getArea());
        System.out.printf("Circumference: %.2f\n", cir1.getCircumference());

        System.out.println("Cir 1, ver2");
        cir1.setRadius(4);
        System.out.println(cir1);
        System.out.printf("Area: %.2f\n", cir1.getArea());
        System.out.printf("Circumference: %.2f\n", cir1.getCircumference());

        System.out.println("Cir 2");
        System.out.println(cir2);
        System.out.printf("Area: %.2f\n", cir2.getArea());
        System.out.printf("Circumference: %.2f\n", cir2.getCircumference());

    }
}
