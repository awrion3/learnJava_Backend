package week02;

public class Prac216 {
    public static void main(String[] args) {
        int i = 1;
        do {
            int k = 10;
            while (k < 20){
                System.out.println(i * k);
                k += 5;
            }
            i += 2;
        } while (i < 5);
    }
}