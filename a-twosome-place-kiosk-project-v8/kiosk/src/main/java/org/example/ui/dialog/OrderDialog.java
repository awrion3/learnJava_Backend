/**
 * The OrderDialog class allows users to place food/beverage orders,
 * with options to select quantity(1~10) and temperature preference,
 * displaying the item name and price at the top and an order confirmation button.
 */
package org.example.ui.dialog;

import java.awt.*;
import javax.swing.*;
import org.example.model.MenuItem;
import org.example.model.Order;
import org.example.ui.MenuPanel;
import org.example.ui.theme.TwoButton;
import org.example.ui.theme.TwoLabel;

public class OrderDialog extends JDialog {
    public OrderDialog(JFrame parent, MenuItem item, MenuPanel menuPanel) {
        super(parent, "PLACE ORDER", true);
        setLayout(new BorderLayout());

        // Display product name and price at the top
        JLabel itemLabel = new JLabel(item.getName() + " - " + item.getPrice() + " won", SwingConstants.CENTER);
        add(itemLabel, BorderLayout.NORTH);

        // Place quantity and options panel in the center
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Set up the quantity panel
        JPanel quantityPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        quantityPanel.add(new TwoLabel("Quantity:"));
        SpinnerModel model = new SpinnerNumberModel(1, 1, 10, 1);
        JSpinner quantitySpinner = new JSpinner(model);
        quantitySpinner.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
        quantitySpinner.setPreferredSize(new Dimension(50, 25));
        quantityPanel.add(quantitySpinner);

        // Set up the option panel
        JPanel optionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        optionPanel.add(new TwoLabel("Option:"));
        JCheckBox optionHot = new JCheckBox("HOT");
        optionHot.setFont(new Font("Times New Roman", Font.BOLD, 13));
        optionPanel.add(optionHot);

        // Add quantity and options panels to the center panel
        centerPanel.add(quantityPanel);
        centerPanel.add(optionPanel);

        add(centerPanel, BorderLayout.CENTER);

        // Add order button at the bottom
        JPanel buttonPanel = new JPanel();
        TwoButton confirmButton = new TwoButton("Order");
        confirmButton.addActionListener(e -> {
            int quantity = (int) quantitySpinner.getValue();
            menuPanel.addOrder(new Order(item, quantity));
            dispose();
        });
        buttonPanel.add(confirmButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(300, 200);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
