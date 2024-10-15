package week07.prac106;

public class SecondClass extends FirstClass {
    public static void main(String[] args) {
        double result_1, result_2, result_3;
        SecondClass seCl = new SecondClass();

        //using methods from super class
        result_1 = seCl.method_1(3, 4, 6);
        System.out.println("result_1 = " + result_1);

        result_2 = seCl.method_2(3);
        System.out.printf("result_2 = %.2f\n", result_2);

        result_3 = seCl.method_2(1.5);
        System.out.printf("result_3 = %.2f\n", result_3);
    }
}