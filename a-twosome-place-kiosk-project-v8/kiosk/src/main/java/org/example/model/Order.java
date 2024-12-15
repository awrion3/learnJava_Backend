/**
 * The Order class is designed to manage a specific menu item and its quantity,
 * allowing for total price calculation and quantity adjustment.
 */
package org.example.model;

public class Order {
    private MenuItem menuItem;
    private int quantity;

    public Order(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    // Increase and decrease quantity
    public void increaseQuantity() {
        quantity++;
    }

    public void decreaseQuantity() {
        if (quantity > 1) quantity--;
    }

    // Calculate total price unit price * quantity
    public int getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return menuItem.getName() + " ";
    }
}
