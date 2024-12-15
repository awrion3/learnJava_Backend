/**
 * The PaymentDialog class displays the total order amount,
 * allows users to select a payment method from different card issuers
 * and includes confirmation and close buttons to process or cancel the payment.
 */
package org.example.ui.dialog;

import java.awt.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import org.example.model.OrderManager;
import org.example.ui.KioskManager;
import org.example.ui.theme.TwoButton;

public class PaymentDialog extends JDialog {

    private JLabel cardLogoLabel;

    public PaymentDialog(JFrame parent, OrderManager orderManager, KioskManager kioskManager) {
        super(parent, "Payment Confirmation", true);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE);

        // Add top logo panel
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.WHITE);
        JLabel logoLabel = new JLabel(
                new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("images/util/logo4.jpg"))
                        .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        logoPanel.add(logoLabel);
        add(logoPanel, BorderLayout.NORTH);

        // Outer panel that adds padding around the content panel
        JPanel outerPanel = new JPanel();
        outerPanel.setLayout(new BorderLayout());
        outerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        outerPanel.setBackground(Color.WHITE);

        // Main content panel with black border
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Payment amount label
        JLabel amountLabel = new JLabel("Payment Amount: " + orderManager.calculateTotal() + " ₩");
        amountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        contentPanel.add(Box.createVerticalStrut(10)); // 상단에 약간의 패딩 추가
        contentPanel.add(amountLabel);
        contentPanel.add(Box.createVerticalStrut(20)); // 금액 레이블 아래에 여백 추가

        // Create a panel for card selection and logo
        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
        cardPanel.setBackground(Color.WHITE);
        cardPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Card company selection panel
        JPanel cardSelectionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0)); // 수직 간격 감소
        cardSelectionPanel.setBackground(Color.WHITE);
        JLabel selectCardLabel = new JLabel("Select Card Issuer:");
        String[] cardIssuers = {"BC Card", "Hyundai Card", "KB Card", "Shinhan Card", "Samsung Pay"};
        JComboBox<String> cardIssuerComboBox = new JComboBox<>(cardIssuers);

        cardSelectionPanel.add(selectCardLabel);
        cardSelectionPanel.add(cardIssuerComboBox);
        cardPanel.add(cardSelectionPanel);

        // Add minimum spacing between combo box and logo
        cardPanel.add(Box.createVerticalStrut(5));

        // Card logo display label
        cardLogoLabel = new JLabel();
        cardLogoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cardLogoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JPanel logoContainerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // No additional padding
        logoContainerPanel.setBackground(Color.WHITE);
        logoContainerPanel.add(cardLogoLabel);
        cardPanel.add(logoContainerPanel);

        // Add the card panel to the content panel
        contentPanel.add(cardPanel);
        contentPanel.add(Box.createVerticalStrut(20)); // Add margin below card panel

        // Show initial logo
        updateCardLogo((String) cardIssuerComboBox.getSelectedItem());

        // Update logo when card company changes
        cardIssuerComboBox.addActionListener(e -> updateCardLogo((String) cardIssuerComboBox.getSelectedItem()));

        outerPanel.add(contentPanel, BorderLayout.CENTER);
        add(outerPanel, BorderLayout.CENTER);

        // Set button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);

        TwoButton confirmButton = new TwoButton("Confirm Payment");
        confirmButton.addActionListener(e -> {
            if (cardIssuerComboBox.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Please select a card issuer.", "Selection Required",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                String selectedCardIssuer = (String) cardIssuerComboBox.getSelectedItem(); // Save selected card company
                dispose();
                new ReceiptDialog(parent, orderManager, kioskManager,
                        selectedCardIssuer); // Forward to selected card company
            }
        });

        TwoButton closeButton = new TwoButton("Close");
        closeButton.addActionListener(e -> dispose());

        buttonPanel.add(confirmButton);
        buttonPanel.add(closeButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Adjust the size and position of the dialog
        setSize(500, 350);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    private Map<String, String> getCardLogos() {
        Map<String, String> logos = new HashMap<>();
        logos.put("BC Card", "images/cards/bc.png");
        logos.put("Hyundai Card", "images/cards/hd.png");
        logos.put("KB Card", "images/cards/kb.jpg");
        logos.put("Shinhan Card", "images/cards/sh.png");
        logos.put("Samsung Pay", "images/cards/samsung.png");
        return logos;
    }

    private void updateCardLogo(String cardIssuer) {
        Map<String, String> cardLogos = getCardLogos();
        String logoPath = cardLogos.getOrDefault(cardIssuer, null);

        if (logoPath != null) {
            ImageIcon logoIcon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource(logoPath))
                    .getImage().getScaledInstance(100, 50, Image.SCALE_SMOOTH));
            cardLogoLabel.setIcon(logoIcon);
        } else {
            cardLogoLabel.setIcon(null);
        }
    }
}
