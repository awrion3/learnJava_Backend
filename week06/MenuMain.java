package week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuMain {
    public static void main(String[] args) {
        //메뉴 리스트 생성                 //아래 값으로 초기화
        List <MenuItem> menuItemList = new ArrayList<>(
                    Arrays.asList( //MenuItem 객체들 바탕으로 생성한 ArrayList 리턴
                        new MenuItem("Pizza", 10.0),
                        new MenuItem("Burger", 15.0),
                        new MenuItem("French Fries", 20.0),
                        new MenuItem("Hot Dog", 25.0),
                        new MenuItem("Pasta", 30.0),
                        new MenuItem("Chicken", 35.0),
                        new MenuItem("Fried Rice", 40.0),
                        new MenuItem("Pizza", 50.0),
                        new MenuItem("Burger", 55.0),
                        new MenuItem("French Fries", 60.0),
                        new MenuItem("Hot Dog", 65.0),
                        new MenuItem("Pasta", 70.0),
                        new MenuItem("Chicken", 75.0),
                        new MenuItem("Fried Rice", 80.0),
                        new MenuItem("Pizza", 90.0),
                        new MenuItem("Burger", 95.0),
                        new MenuItem("French Fries", 100.0),
                        new MenuItem("Hot Dog", 105.0),
                        new MenuItem("Pasta", 110.0),
                        new MenuItem("Chicken", 115.0),
                        new MenuItem("Fried Rice", 120.0)
                    )
        ); //

        //향상된 for문: ArrayList 각 요소에 대해 한줄씩 출력
        menuItemList.forEach(System.out::println);

        //주문 예시
        OrderService orderService = new SimpleOrderService();

        orderService.placedOrder(menuItemList.get(0));
        orderService.placedOrder(menuItemList.get(1));
        orderService.placedOrder(menuItemList.get(3));
        orderService.placedOrder(menuItemList.get(4));
    }
}