package org.example.ui.dialog;

import org.example.model.MenuItem;
import org.example.model.Order;
import org.example.ui.MenuPanel;

import javax.swing.*;
import java.awt.*;
import org.example.ui.theme.TwoButton;
import org.example.ui.theme.TwoLabel;

public class OrderDialog extends JDialog {
    public OrderDialog(JFrame parent, MenuItem item, MenuPanel menuPanel) {
        super(parent, "PLACE ORDER", true);
        setLayout(new BorderLayout());

        JLabel itemLabel = new JLabel(item.getName() + " - " + item.getPrice() + " won", SwingConstants.CENTER);
        add(itemLabel, BorderLayout.NORTH);

        JPanel optionPanel = new JPanel();
        JCheckBox optionHot = new JCheckBox("HOT");
        optionHot.setFont(new Font("Times New Roman", Font.BOLD, 13));
        optionHot.setPreferredSize(new Dimension(55, 25));
        optionPanel.add(optionHot);
        add(optionPanel, BorderLayout.EAST);

        JPanel quantityPanel = new JPanel();
        quantityPanel.add(new TwoLabel("Quantity:"));
        SpinnerModel model = new SpinnerNumberModel(1, 1, 10, 1);
        JSpinner quantitySpinner = new JSpinner(model);
        quantitySpinner.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
        quantitySpinner.setPreferredSize(new Dimension(50, 25));
        quantityPanel.add(quantitySpinner);
        add(quantityPanel, BorderLayout.WEST);

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