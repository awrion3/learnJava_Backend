package week07.prac108;

public class Words {
    public static void main(String[] args) {
        double ratio;

        Dictionary dict = new Dictionary();

        dict.setDefinitions(200);
        dict.setPages(1000);  //dict using method inherited from book

        ratio = dict.comeputeRatio();
        System.out.println("Ratio: " + ratio);
    }
}
