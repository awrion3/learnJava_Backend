/**
 * The TwoButtons class provides buttons that respond in black and white colors
 * according to the mouse cursor movement for the integrated design of
 * the Twosome Place kiosk program buttons.
 * */
package org.example.ui.theme;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

// Makes button theme named two(some place)button that extends from JButton
public class TwoButton extends JButton {
    // Set initial color values for black&white color theme button
    private Color back = new Color(0, 0, 0);
    private Color fore = new Color(220, 220, 220);
    // Set padding effect initial values
    private int paddingWidth = 2, paddingHeight = 1;

    public TwoButton(String text) {
        // Sets text in the button
        setText(text);

        // Use dimension to set width and height with added padding space
        Dimension dimension = getPreferredSize();
        int width = (int) dimension.getWidth() + paddingWidth * 2;
        int height = (int) dimension.getHeight() + paddingHeight * 2;
        setPreferredSize(new Dimension(width, height));

        // Set properties of the button
        setOpaque(false);
        setBorder(null);
        setBackground(null);
        setForeground(back);

        // Make button color change by using mouse entered or exited acton
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
                setBackground(null);
                setForeground(back);
                revalidate();
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        // Use graphics to set rendering hints for antialiasing
        Graphics2D graph = (Graphics2D) g;
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set dimension size with adjustment of bounds
        Dimension dimension = getPreferredSize();
        int width = (int) dimension.getWidth() - 1;
        int height = (int) dimension.getHeight() - 1;

        // Set background color and draw filled rounded rectangle with scaled values
        if(getBackground() != null) {
            graph.setColor(getBackground());
            graph.fillRoundRect(1, 1, (int) (width - 1 / 3.5), (int) (height - 1 / 2.8), 15, 15);
        }

        // Set foreground color and draw round rectangle with basic stroke
        graph.setColor(getForeground());
        graph.setStroke(new BasicStroke(1));
        graph.drawRoundRect(0, 0, width, height, 15, 15);

        // Set font of the button with bold and italics
        graph.setColor(getForeground());
        graph.setFont(new Font("Times New Roman", 3, 18));

        // Use font measurement to set text alignment and spacing within the rectangle
        FontMetrics fontMetrics = graph.getFontMetrics();
        Rectangle rectangle = fontMetrics.getStringBounds(getText(), graph).getBounds();

        // Render text in coordinate and apply ascent for y to consider font baseline to top distance
        graph.drawString(getText(), (width - rectangle.width) / 2,
                (height - rectangle.height) / 2 + fontMetrics.getAscent());
    }
}
