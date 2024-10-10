package week06;

public class SimpleOrderService implements OrderService {
    @Override //implementation of interface
    public void placedOrder(MenuItem menuItem) {
        System.out.println("Ordering " + menuItem.getName() + " for " + menuItem.getPrice());
    }
}
