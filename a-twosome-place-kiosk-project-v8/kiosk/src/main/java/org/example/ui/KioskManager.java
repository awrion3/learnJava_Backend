/**
 * The KioskManager class manages the main frame of a cafe kiosk application’s window
 * and handles switching between main and menu panels.
 * */
package org.example.ui;

import javax.swing.JFrame;

public class KioskManager {
    private JFrame frame;

    public KioskManager() {
        frame = new JFrame("A TWOSOME PLACE Cafe Kiosk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);

        showMainPanel();
        frame.setVisible(true);
    }

    public void showMainPanel() {
        MainPanel mainPanel = new MainPanel(this);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(mainPanel.getPanel());
        frame.revalidate();
        frame.repaint();
    }

    public void showMenuPanel() {
        MenuPanel menuPanel = new MenuPanel(this);
        frame.setContentPane(menuPanel.getPanel());
        frame.revalidate();
        frame.repaint();
    }

    public JFrame getFrame() {
        return frame;
    }
}
