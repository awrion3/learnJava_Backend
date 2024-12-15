/**
 * The TwoLabel class specifies font properties for the label to maintain consistent formatting.
 */
package org.example.ui.theme;

import java.awt.Font;
import javax.swing.JLabel;

public class TwoLabel extends JLabel {
    // Twosome place label extends from JLabel
    public TwoLabel(String text) {
        super(text);
        setFont();
    }

    // Set font theme for twosome place  label
    private void setFont() {
        this.setFont(new Font("Times New Roman", Font.BOLD, 15));
    }
}
