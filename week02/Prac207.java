package week02;

public class Prac207 {
    public static void main(String[] args) {
        int a = 30;
        int b = 035; //3 * 8 + 5 = 29 //octal
        int c = 53;

        if (a > b && a < c)
            System.out.println("A is grater than B and less than C");
        else if (b > a && b < c)
            System.out.println("B is grater than A and less than C");
        else
            System.out.println("Condition not satisfied");
    }
}
