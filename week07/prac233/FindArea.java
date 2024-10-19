package week07.prac233;

public class FindArea {
    public static void main(String[] args) {
        Figure fig = new Figure(2, 3);
        System.out.println(fig.area());
        //polymorphism
        fig = new Rectangle(2, 3);
        System.out.println(fig.area());
        fig = new Triangle(2, 3);
        System.out.println(fig.area());
        fig = new Figure(2, 3);
        System.out.println(fig.area());
    }
}