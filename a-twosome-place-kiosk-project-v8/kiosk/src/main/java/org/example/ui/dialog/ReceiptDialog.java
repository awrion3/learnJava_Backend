/**
 * The ReceiptDialog class displays a receipt containing order details, payment information
 * and monthly promotional content while providing functionality to reset after order completion.
 */
package org.example.ui.dialog;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import org.example.model.Order;
import org.example.model.OrderManager;
import org.example.ui.AdvertiseManager;
import org.example.ui.KioskManager;
import org.example.ui.theme.TwoButton;

public class ReceiptDialog extends JDialog {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public ReceiptDialog(JFrame parent, OrderManager orderManager, KioskManager kioskManager, String cardIssuer) {
        super(parent, "Receipt", true);
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Set header information
        StringBuilder headerInfo = new StringBuilder();
        headerInfo.append("\t\t\tRECEIPT\n")
                .append("[Store Name] A Twosome Place\n")
                .append("[Address] 123 Gwangjin-gu, Seoul\n")
                .append("[Phone] 02-123-4567\n")
                .append("[Date] ").append(dateFormat.format(Calendar.getInstance().getTime()))
                .append("\n")
                .append("========================================================\n")
                .append("   Item                   Unit Price   Qty       Amount\n")
                .append("--------------------------------------------------------\n");

        // Order details
        StringBuilder orderDetails = new StringBuilder();
        int totalAmount = 0;

        for (Order order : orderManager.getOrders()) {
            String itemName = order.getMenuItem().getName();
            int unitPrice = order.getMenuItem().getPrice();
            int quantity = order.getQuantity();
            int amount = order.getTotalPrice();

            totalAmount += amount;

            // Add each order item as a sorted column
            orderDetails.append(String.format(" %-20s %12d %6d %12d\n", itemName, unitPrice, quantity, amount));
        }

        // Calculate and display total and VAT
        int vat = (int) (totalAmount * 0.1);
        int subtotal = totalAmount - vat;

        // Add total information aligned to the "Amount" column
        StringBuilder footerInfo = new StringBuilder();
        footerInfo.append("--------------------------------------------------------\n")
                .append(String.format(" Subtotal:%31s %12d\n", "", subtotal))
                .append(String.format(" VAT:%36s %12d\n", "", vat))
                .append("--------------------------------------------------------\n")
                .append(String.format(" Total Amount:%27s %12d\n", "", totalAmount))
                .append("========================================================\n")
                .append("Payment Method: ").append(cardIssuer).append("\n")
                .append("Authorization No: 12345678\n")
                .append("Payment Date: ").append(dateFormat.format(Calendar.getInstance().getTime()));

        // Display a combination of header, order details, and total information
        String receiptText = headerInfo.toString() + orderDetails.toString() + footerInfo.toString();

        // Use advertise manager to get this month event banner image path
        String monthEvent = AdvertiseManager.getMonthAdvertisement();
        // Get current month event advertise banner with scaled size
        JLabel advertiseLabel = new JLabel(
                new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(monthEvent))
                        .getImage().getScaledInstance(450, 200, Image.SCALE_SMOOTH)));
        // Place advertise banner to the north of the receipt
        add(advertiseLabel, BorderLayout.NORTH);

        // Set the receipt text area
        JTextArea receiptTextArea = new JTextArea(receiptText);
        receiptTextArea.setFont(new Font("Monospaced", Font.BOLD, 13));
        receiptTextArea.setEditable(false);
        receiptTextArea.setBackground(Color.WHITE);
        receiptTextArea.setLineWrap(true);
        receiptTextArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(receiptTextArea);
        scrollPane.setPreferredSize(new Dimension(535, 500));
        add(scrollPane, BorderLayout.CENTER);

        // Set the close button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        TwoButton closeButton = new TwoButton("Close");
        closeButton.addActionListener(e -> {
            orderManager.clearOrders(); // Reset order history
            kioskManager.showMainPanel(); // Return to main panel
            dispose(); // close dialogue
        });
        buttonPanel.add(closeButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(500, 620);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
