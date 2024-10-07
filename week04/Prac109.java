package week04;

import java.lang.Math;

public class Prac109 {
    public static void main(String[] args) {
        Stock stk = new Stock("SU", "Sejong");
        stk.setPreviousClosingPrice(100);
        stk.setCurrentPrice(90);

        System.out.println("The Price change for "
                + stk.getSymbol() + " "
                + stk.getName() + " is " //0.XX.. * 10000 / 100 = 2 digit
                + Math.round(stk.getChangePercent() * 10000) / 100 + "%"); //round to .X
    }
}