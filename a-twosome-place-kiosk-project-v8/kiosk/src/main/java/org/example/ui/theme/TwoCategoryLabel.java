/**
 * The TwoCategoryLabel class gives the product category label on the menu panel
 * a color effect tailored to the Twosome Place theme that responds to mouse clicks.
 */
package org.example.ui.theme;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class TwoCategoryLabel extends JLabel {
    // Set initial color values to match with a-twosome-place color theme
    private Color unClick = new Color(0, 0, 0);
    private Color onClick = new Color(140, 0, 0);
    private Color front = new Color(220, 220, 220);
    // Also set padding and shadow effect initial values
    private int paddingWidth = 15, paddingHeight = 2;
    private int shadowEffect = 3;

    public TwoCategoryLabel(String text) {
        // Sets text in the label
        setText(text);

        // Use dimension to set width and height with padding and shadow effect space
        Dimension dimension = getPreferredSize();
        int width = (int) dimension.getWidth() + paddingWidth * 3;
        int height = (int) dimension.getHeight() + paddingHeight * 2 + shadowEffect;
        setPreferredSize(new Dimension(width, height));

        // Set other properties of the two(some place) menu category label
        setOpaque(false);
        setBorder(null);
        setBackground(unClick);
        setForeground(front);

        // Make button color change relative to mouse click acton (pressed or released)
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(onClick);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(unClick);
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        // Use graphics to set rendering hints related to antialiasing
        Graphics2D graph = (Graphics2D) g;
        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set dimension size with consideration of shadow effect
        Dimension dimension = getPreferredSize();
        int width = (int) dimension.getWidth();
        int height = (int) dimension.getHeight() - shadowEffect;

        // Set color of on-click crimson and draw filled rounded rectangle in coordinate of x, y
        graph.setColor(onClick);
        graph.fillRoundRect(0, 5, width, height, 15, 15);

        // Set color of un-click background and draw filled rounded rectangle in base coordinate of x, y
        graph.setColor(getBackground());
        graph.fillRoundRect(0, 0, width, height, 15, 15);

        // Set color of front foreground and set font of the text as combination of bold and italic
        graph.setColor(getForeground());
        graph.setFont(new Font("Times New Roman", 3, 18));

        // Returns font object measurement
        FontMetrics fontMetrics = graph.getFontMetrics();
        // Use get string bounds to set text alignment and spacing rendering relative to the rectangle
        Rectangle rectangle = fontMetrics.getStringBounds(getText(), graph).getBounds();

        // Render the text with x, y coordinate and use ascent to consider font baseline to top distance for y
        graph.drawString(getText(), (width - rectangle.width) / 2,
                (height - rectangle.height + shadowEffect) / 2 + fontMetrics.getAscent());
    }
}
