/**
 * The MainPanel class is designed to create the main screen of the Twosome Place kiosk program,
 * updating notices periodically and displaying the menu screen through ‘Eat Here’ and ‘To Go’ buttons.
 */
package org.example.ui;

import java.awt.*;
import javax.swing.*;
import org.example.ui.theme.TwoButton;
import org.example.ui.dialog.NoticeDialog;

public class MainPanel {
    private JPanel mainPanel;
    private Timer timerNoticePanel;

    public MainPanel(KioskManager kioskManager) {
        mainPanel = new JPanel(new BorderLayout());

        // Create panel for notice label
        JPanel noticePanel = new JPanel();
        // Create notice label (using notice dialog method)
        String randomString = NoticeDialog.getRandomNotice();
        JLabel noticeLabel = new JLabel(randomString);
        // Set font of the label and add it to panel
        noticeLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
        noticePanel.add(noticeLabel);
        // Use timer and set delay to notice label color change action
        timerNoticePanel = new Timer(100, new NoticeDialog(noticeLabel));
        timerNoticePanel.start();
        // Set layout of the notice panel
        mainPanel.add(noticePanel, BorderLayout.NORTH);

        JLabel imageLabel = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("twosome.gif")));
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        TwoButton eatInButton = new TwoButton("Eat Here");
        TwoButton takeOutButton = new TwoButton("To Go");

        eatInButton.addActionListener(e -> kioskManager.showMenuPanel());
        takeOutButton.addActionListener(e -> kioskManager.showMenuPanel());

        buttonPanel.add(eatInButton);
        buttonPanel.add(takeOutButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return mainPanel;
    }
}
