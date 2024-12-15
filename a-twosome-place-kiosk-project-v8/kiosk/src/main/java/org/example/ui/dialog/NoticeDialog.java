/**
 * The NoticeDialog class randomly generates notices
 * containing useful promotional information for customers,
 * displays them on the main screen of the kiosk,
 * and provides a color change effect to attract customers' attention.
 */
package org.example.ui.dialog;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;

public class NoticeDialog implements ActionListener {
    // String data related to user notices
    private static final String[] USER_NOTICES = {
            "OCTOBER HALLOWEEN SALE! 5% Discount on Desserts!",
            "NOVEMBER 11.11 SALE! 11% Discount on Tiramisu!",
            "BLACK FRIDAY SALE! 10% Discount on Beverages!",
            "NEW YEAR SALE! 3% Discount on Sandwiches!",
            "SUMMER HOLIDAY SALES WEEK! 7% Discount on Ice Coffees",
            "Thank you for visiting Twosome Place! Come Again!",
            "Special offers! Enjoy 20% off - all desserts with any coffee!",
            "10th Anniversary Day! Free coffee refills today!",
            "Flash Sale! All sandwiches are 5% off during Early Morning!"
    };

    // Set initial color values
    private JLabel label;
    private Color crimson = new Color(140, 0, 0);
    private Color black  = new Color(0, 0, 0);
    private int count;

    // Parametrized constructor
    public NoticeDialog(JLabel label){
        this.label = label;
    }

    // Returns random notice from string data
    public static String getRandomNotice() {
        Random random = new Random();
        //picks random string from string data above
        int index = random.nextInt(USER_NOTICES.length);
        return USER_NOTICES[index];
    }

    // Use count value to generate change colors action
    @Override
    public void actionPerformed(ActionEvent e) {
        if(count % 2 == 0)
            label.setForeground(crimson);
        else
            label.setForeground(black);
        count++;
    }
}
