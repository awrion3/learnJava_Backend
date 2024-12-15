/**
 * The MenuItem class is designed to manage the name, price, and image path of a menu item
 * in the Twosome Place kiosk program, providing a string representation of the item.
 */
package org.example.model;

public class MenuItem {
    private String name;
    private int price;
    private String imagePath; // Field to store the image path

    public MenuItem(String name, int price, String imagePath) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath; // Initialize image path
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // Add a method that returns the image path
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public String toString() {
        return name + " - " + price + "원";
    }
}
