package week07.prac107;

public class Access {
    public static void main(String[] args) {
        double res1, res2, res3;

        Data1 dat1 = new Data1();
        res1 = dat1.Calculation(7);
        System.out.printf("Res1: %.4f\n", res1);

        Data2 dat2 = new Data2();
        res2 = dat2.Calculation(7);
        System.out.printf("Res2: %.4f\n", res2);

        Data3 dat3 = new Data3();
        res3 = dat3.Calculation(7);
        System.out.printf("Res3: %.4f\n", res3);
    }
}