/**
 * The MenuPanel class is designed to display menu items, manage orders,
 * and provide functionality for adjusting order quantities
 * and calculating the total amount in the Twosome Place kiosk program.
 */
package org.example.ui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import org.example.model.MenuItem;
import org.example.model.Order;
import org.example.model.OrderManager;
import org.example.ui.dialog.OrderDialog;
import org.example.ui.dialog.PaymentDialog;
import org.example.ui.theme.TwoButton;
import org.example.ui.theme.TwoCategoryLabel;
import org.example.ui.theme.TwoLabel;
import org.example.ui.theme.TwoPanel;

public class MenuPanel {
    private JPanel menuPanel, itemListPanel, orderPanel, totalPanel;
    private JLabel totalLabel;
    private OrderManager orderManager = new OrderManager();
    private KioskManager kioskManager;

    public MenuPanel(KioskManager kioskManager) {
        this.kioskManager = kioskManager;
        menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        // Set up the logo panel
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.DARK_GRAY);
        JLabel logoLabel = new JLabel(
                new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("images/util/logo4.jpg"))
                        .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)), SwingConstants.CENTER);
        logoPanel.add(logoLabel);

        // Set up the category and home button panels
        JPanel categoryPanel = new JPanel(new BorderLayout());
        categoryPanel.setBackground(Color.DARK_GRAY);

        // Function to set home image and move to main screen
        JLabel homeLabel = new JLabel(
                new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("images/util/home.png"))
                        .getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        homeLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                kioskManager.showMainPanel(); // Return to main panel
            }
        });
        categoryPanel.add(homeLabel, BorderLayout.WEST);

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 35, 5));
        centerPanel.setBackground(Color.DARK_GRAY);
        centerPanel.add(createCategoryLabel("Coffee"));
        centerPanel.add(createCategoryLabel("Beverage"));
        centerPanel.add(createCategoryLabel("Dessert"));
        centerPanel.add(createCategoryLabel("Sandwich/Salad"));
        categoryPanel.add(centerPanel, BorderLayout.CENTER);

        //Setting up the order history panel
        itemListPanel = new JPanel(new GridLayout(2, 3, 15, 15));
        itemListPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        orderPanel = new JPanel();
        orderPanel.setLayout(new BoxLayout(orderPanel, BoxLayout.Y_AXIS));
        orderPanel.setBackground(Color.GRAY);
        JScrollPane scrollPane = new JScrollPane(orderPanel);
        scrollPane.setPreferredSize(new Dimension(580, 200));

        // Total amount and payment button
        totalPanel = new JPanel(new BorderLayout());
        totalLabel = new TwoLabel("Total Price: ");
        TwoButton payButton = new TwoButton("Payment");
        payButton.addActionListener(e -> new PaymentDialog(kioskManager.getFrame(), orderManager, kioskManager));

        totalPanel.add(totalLabel, BorderLayout.WEST);
        totalPanel.add(payButton, BorderLayout.EAST);

        menuPanel.add(logoPanel);
        menuPanel.add(categoryPanel);
        menuPanel.add(itemListPanel);
        menuPanel.add(scrollPane);
        menuPanel.add(totalPanel);

        updateItems("coffee");
    }

    // Create category labels and update items on click
    private JLabel createCategoryLabel(String text) {
        // Use twosome place category label for menu panel
        TwoCategoryLabel label = new TwoCategoryLabel(text);
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateItems(text.toLowerCase());
            }
        });
        return label;
    }

    // Update item information by category (image, product name, price)
    private void updateItems(String category) {
        itemListPanel.removeAll();

        MenuItem[] items;
        switch (category) {
            case "coffee":
                items = new MenuItem[]{
                        new MenuItem("Americano", 4500, "images/coffee/Ice Coffee.png"),
                        new MenuItem("White Mocha", 5400, "images/coffee/Ice White Mocha.png"),
                        new MenuItem("Cold Brew Tonic", 6000, "images/coffee/Cold Brew Tonic.png"),
                        new MenuItem("Nitro Cold Brew", 6300, "images/coffee/Nitro Cold Brew.png"),
                        new MenuItem("Tiramisu Latte", 5800, "images/coffee/Tiramisu Latte.png"),
                        new MenuItem("Caramel Macchiato", 5600, "images/coffee/Ice Caramel Macchiato.png"),
                };
                break;
            case "beverage":
                items = new MenuItem[]{
                        new MenuItem("Caramel Frappe", 5300, "images/beverage/Caramel Frappe.png"),
                        new MenuItem("Choco Shake", 5000, "images/beverage/Choco Shake.png"),
                        new MenuItem("Grapefruit Ade", 5500, "images/beverage/Grapefruit Ade.png"),
                        new MenuItem("Kiwi Banana Juice", 5500, "images/beverage/Kiwi Banana Juice.png"),
                        new MenuItem("Orange Ade", 5500, "images/beverage/Orange Ade.png"),
                        new MenuItem("Strawberry Latte", 5500, "images/beverage/Strawberry Latte.png"),
                };
                break;
            case "dessert":
                items = new MenuItem[]{
                        new MenuItem("Blanc Cheese Berry", 6000, "images/dessert/Blanc Cheese berry.png"),
                        new MenuItem("Pecan Tart", 6500, "images/dessert/Pecan Tart.png"),
                        new MenuItem("Cream Brulee", 6200, "images/dessert/Cream Brulee.png"),
                        new MenuItem("Berry Mousse", 6000, "images/dessert/Berry Mousse.png"),
                        new MenuItem("Chocolate Ganache", 5900, "images/dessert/Chocolate Ganache.png"),
                        new MenuItem("Tiramisu", 5600, "images/dessert/Tiramisu.png"),
                };
                break;
            case "sandwich/salad":
                items = new MenuItem[]{
                        new MenuItem("Bulgogi Bake", 6000, "images/sandwich/Bulgogi Bake.png"),
                        new MenuItem("Hot Chicken Bake", 6000, "images/sandwich/Hot Chicken Bake.png"),
                        new MenuItem("Carprese Sandwich", 5000, "images/sandwich/Carprese Sandwich.png"),
                        new MenuItem("Chicken Sandwich", 5000, "images/sandwich/Chicken Omelet Sandwich.png"),
                        new MenuItem("Carprese Salad", 6500, "images/sandwich/Carprese Salad.png"),
                        new MenuItem("Side Salad", 3500, "images/sandwich/Side Salad.png"),
                };
                break;
            default:
                items = new MenuItem[0];
        }

        // Setting up the item panel
        for (MenuItem item : items) {
            JPanel itemPanel = new JPanel(new BorderLayout());
            itemPanel.setBackground(Color.DARK_GRAY);

            JLabel imageLabel = new JLabel(
                    new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(item.getImagePath()))
                            .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
            JLabel nameLabel = new JLabel(item.getName(), SwingConstants.CENTER);
            TwoLabel priceLabel = new TwoLabel(item.getPrice() + " won");
            priceLabel.setAlignmentX(SwingConstants.CENTER);

            JPanel textPanel = new JPanel();
            textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
            textPanel.setBackground(Color.WHITE);
            nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            priceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            textPanel.add(nameLabel);
            textPanel.add(priceLabel);

            itemPanel.add(imageLabel, BorderLayout.CENTER);
            itemPanel.add(textPanel, BorderLayout.SOUTH);

            itemPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    new OrderDialog(kioskManager.getFrame(), item, MenuPanel.this);
                }
            });
            itemListPanel.add(itemPanel);
        }
        itemListPanel.revalidate();
        itemListPanel.repaint();
    }

    // Set the order history panel layout
    public void addOrder(Order order) {
        // Add the order to the OrderManager
        orderManager.addOrder(order);

        // Use twosome place panel to give effect in single order panel
        TwoPanel singleOrderPanel = new TwoPanel();
        singleOrderPanel.setLayout(new GridBagLayout());
        singleOrderPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        singleOrderPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Set the width to maximum expansion and the height to a fixed size
        singleOrderPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 5, 0, 5); // Set spacing between components

        // Set product name label
        gbc.gridx = 0;
        gbc.weightx = 1.0;
        TwoLabel orderLabel = new TwoLabel(order.getMenuItem().getName());
        singleOrderPanel.add(orderLabel, gbc);

        // "-" button settings
        gbc.gridx = 1;
        gbc.weightx = 0;
        JButton minusButton = new JButton("-");
        styleButton(minusButton);
        singleOrderPanel.add(minusButton, gbc);

        // Set quantity label
        gbc.gridx = 2;
        JLabel quantityLabel = new JLabel(String.valueOf(order.getQuantity()));
        quantityLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        singleOrderPanel.add(quantityLabel, gbc);

        // "+" button settings
        gbc.gridx = 3;
        JButton plusButton = new JButton("+");
        styleButton(plusButton);
        singleOrderPanel.add(plusButton, gbc);

        // Set price labels
        gbc.gridx = 4;
        TwoLabel priceLabel = new TwoLabel(order.getTotalPrice() + " Won ");
        priceLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        priceLabel.setPreferredSize(new Dimension(100, 25));
        singleOrderPanel.add(priceLabel, gbc);

        // Set the delete "x" button
        gbc.gridx = 5;
        JButton deleteButton = new JButton("x");
        styleButton(deleteButton);
        singleOrderPanel.add(deleteButton, gbc);

        // Button event handling
        minusButton.addActionListener(e -> {
            if (order.getQuantity() > 1) {
                order.decreaseQuantity();
                quantityLabel.setText(String.valueOf(order.getQuantity()));
                priceLabel.setText(order.getTotalPrice() + " Won ");
                updateTotal();
            }
        });

        plusButton.addActionListener(e -> {
            order.increaseQuantity();
            quantityLabel.setText(String.valueOf(order.getQuantity()));
            priceLabel.setText(order.getTotalPrice() + " Won ");
            updateTotal();
        });

        deleteButton.addActionListener(e -> {
            orderPanel.remove(singleOrderPanel);
            orderPanel.revalidate();
            orderPanel.repaint();
            orderManager.removeOrder(order);
            updateTotal();
        });

        // Add single order panel to orderPanel
        orderPanel.add(singleOrderPanel);
        orderPanel.setLayout(new BoxLayout(orderPanel, BoxLayout.Y_AXIS)); // List order panel vertically
        orderPanel.revalidate();
        orderPanel.repaint();
        updateTotal();
    }

    private void styleButton(JButton button) {
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 16));
    }

    private void updateTotal() {
        int total = orderManager.calculateTotal();
        totalLabel.setText("Total Price: " + total + " ₩");
    }

    public JPanel getPanel() {
        return menuPanel;
    }
}
