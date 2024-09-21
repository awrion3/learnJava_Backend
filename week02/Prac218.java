package week02;

public class Prac218 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++){
            for (int j = 1; j < 11; j++){ //j <= i
                if (i >= j)
                    System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}