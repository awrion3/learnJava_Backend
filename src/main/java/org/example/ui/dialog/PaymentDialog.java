package org.example.ui.dialog;

import org.example.model.Order;
import org.example.model.OrderManager;
import org.example.ui.KioskManager;

import javax.swing.*;
import java.awt.*;
import org.example.ui.theme.TwoButton;
import org.example.ui.theme.TwoLabel;

public class PaymentDialog extends JDialog {
    public PaymentDialog(JFrame parent, OrderManager orderManager, KioskManager kioskManager) {
        super(parent, "Receipt", true);
        setLayout(new BorderLayout());

        // 영수증 타이틀
        TwoLabel receiptTitle = new TwoLabel("Receipt");
        receiptTitle.setHorizontalAlignment(SwingConstants.CENTER);
        add(receiptTitle, BorderLayout.NORTH);

        // 주문 내역 표시 패널 (스크롤)
        JPanel receiptPanel = new JPanel();
        receiptPanel.setLayout(new BoxLayout(receiptPanel, BoxLayout.Y_AXIS));
        receiptPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // 각 주문 항목 표시
        for (Order order : orderManager.getOrders()) {
            JPanel itemPanel = new JPanel(new BorderLayout());
            TwoLabel itemLabel = new TwoLabel(order.getMenuItem().getName() + " x " + order.getQuantity());
            TwoLabel priceLabel = new TwoLabel(order.getTotalPrice() + " Won");
            priceLabel.setHorizontalAlignment(SwingConstants.RIGHT);

            itemPanel.add(itemLabel, BorderLayout.WEST);
            itemPanel.add(priceLabel, BorderLayout.EAST);
            receiptPanel.add(itemPanel);
        }

        JScrollPane scrollPane = new JScrollPane(receiptPanel);
        scrollPane.setPreferredSize(new Dimension(280, 150));
        add(scrollPane, BorderLayout.CENTER);

        JPanel totalPanel = new JPanel(new BorderLayout());
        TwoLabel totalLabel = new TwoLabel("Total: " + orderManager.calculateTotal() + " ₩");
        totalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        totalPanel.add(totalLabel, BorderLayout.CENTER);

        // 결제 완료 후 메인 화면(초기 화면)으로 돌아가고 주문 내역은 초기화
        TwoButton closeButton = new TwoButton("Close");
        closeButton.addActionListener(e -> {
            orderManager.clearOrders(); // 주문 내역 초기화
            kioskManager.showMainPanel(); // 메인 패널로 돌아가기
            dispose(); // 다이얼로그 닫기
        });
        totalPanel.add(closeButton, BorderLayout.SOUTH);

        add(totalPanel, BorderLayout.SOUTH);

        setSize(300, 300);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}