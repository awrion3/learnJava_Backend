/**
 * The TwoPanel class provides a highlight color effect
 * for the currently selected order menu item
 * to improve readability and convenience for customers.
 */
package org.example.ui.theme;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class TwoPanel extends JPanel {
    // Set initial color values for menu item order status area
    private Color fore = new Color(200, 200, 200);
    private Color back = new Color(150, 140, 130);

    public TwoPanel() {
        // Set back/foreground colors using color values from above
        setBackground(fore);
        setForeground(back);

        // Change colors based on mouse enter and exit movement
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(back);
                setForeground(fore);
                revalidate();
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(fore);
                setForeground(back);
                revalidate();
                repaint();
            }
        });
    }
}
