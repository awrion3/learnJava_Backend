package week03;
import java.util.Scanner;

//CelsiousToFahrenheit
public class Prac210 {
    public static void main(String[] args){
        double celsious;
        double fahrenheit;

        Scanner sc = new Scanner(System.in);
        celsious = sc.nextDouble();

        Prac210b conv = new Prac210b();
        fahrenheit = conv.cToFConvert(celsious);

        System.out.println(fahrenheit);
    }
}