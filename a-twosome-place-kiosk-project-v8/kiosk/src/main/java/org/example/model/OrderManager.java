/**
 * The OrderManager class is designed to manage the list of orders
 * by adding, removing, calculating the total amount, and clearing the orders.
 */
package org.example.model;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Order> orders = new ArrayList<>();

    // Adds and removes order
    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    // Calculate total order amount
    public int calculateTotal() {
        int total = 0;
        for (Order order : orders) {
            total += order.getTotalPrice();
        }
        return total;
    }

    // Return the entire list of orders
    public ArrayList<Order> getOrders() {
        return orders;
    }

    // Reset entire order after payment is completed
    public void clearOrders() {
        orders.clear();
    }
}
