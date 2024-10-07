package week04;

import java.lang.Math;

public class Prac233 {
    public static void main(String[] args) {
        int[] arrCnt = new int[10];
        int ranNum = 0;

        for (int i = 0; i < 10; i++){
            ranNum = (int)(Math.random()*10); //0 ~ 9
            arrCnt[ranNum]++;
        }

        for (int i = 0; i < 10; i++){
            System.out.printf("index %d: count %d\n", i, arrCnt[i]);
        }
    }

}
