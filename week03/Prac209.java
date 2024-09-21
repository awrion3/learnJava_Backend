package week03;

public class Prac209 {
    public static void main(String[] args){
        Prac209b myGradeBook = new Prac209b();

        //Prac209b class is public
        //its method displayMessage is public
        myGradeBook.displayMessage();

        int a;
        Prac209b calc = new Prac209b();
        a = calc.sum();
        System.out.println(a);
    }
}
