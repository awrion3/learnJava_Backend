/*
 * Name: Kim Ji Yun
 * ID: 20012168
 */
package assign04;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Dialogue extends JFrame {
    private String name;
    private String phone;
    private int id;

    public static void main(String[] args) {
        // ensure code runs on Event Dispatch Thread
        EventQueue.invokeLater(() -> {
            try {
                Dialogue dialogFrame = new Dialogue();
                // display frame
                dialogFrame.setVisible(true);
            } catch (Exception e) {
                // show detailed error information
                e.printStackTrace();
            }
        });
    }

    public Dialogue() {
        // TODO: Frame settings
        setTitle("Join Sejong IT Club");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: Title label settings
        JLabel titleLabel = new JLabel("Join Sejong IT Club!", JLabel.CENTER);
        titleLabel.setBounds(100, 10, 300, 30);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(titleLabel);

        // TODO: Student Name settings
        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel.setBounds(50, 60, 200, 25);
        add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(250, 60, 150, 25);
        add(nameField);

        // TODO: Student Phone settings
        JLabel phoneLabel = new JLabel("Student Phone:");
        phoneLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        phoneLabel.setBounds(50, 100, 200, 25);
        add(phoneLabel);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(250, 100, 150, 25);
        add(phoneField);

        // TODO: Student ID settings
        JLabel idLabel = new JLabel("Student ID:");
        idLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        idLabel.setBounds(50, 140, 200, 25);
        add(idLabel);
        JTextField idField = new JTextField();
        idField.setBounds(250, 140, 150, 25);
        add(idField);

        // TODO: Clear button settings
        JButton clearButton = new JButton("Clear All");
        clearButton.setBounds(50, 200, 100, 25);
        add(clearButton);
        // Clear Button Action Listener settings
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: display dialog box question type, before clearing user input
                int response = JOptionPane.showConfirmDialog(
                        clearButton.getParent(),
                        "Are you sure you want to clear all input?",
                        "Confirm Clear",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                );
                // check user response to proceed
                if (response == JOptionPane.YES_OPTION) {
                    // clear text input
                    nameField.setText("");
                    phoneField.setText("");
                    idField.setText("");
                }
            }
        });

        // TODO: Exit Button settings
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(200, 200, 100, 25);
        add(exitButton);
        // Exit Button Action Listener settings
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: display dialog box plain type, before exiting
                JOptionPane.showMessageDialog(
                        clearButton.getParent(),
                        "Exiting Program...",
                        "Program Exit",
                        JOptionPane.PLAIN_MESSAGE
                );
                System.exit(0);
            }
        });

        // TODO: Submit button settings
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(350, 200, 100, 25);
        add(submitButton);
        // Submit Button Action Listener settings
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // save user input data
                name = nameField.getText();
                phone = phoneField.getText();
                try {
                    id = Integer.parseInt(idField.getText());
                } catch (NumberFormatException err) {
                    // TODO: display dialog box error type, when user input is wrong format
                    JOptionPane.showMessageDialog(
                            submitButton.getParent(),
                            "Error! ID must be in integer format!",
                            "Submit Failed",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
                // check user input
                if (phone.length() != 13) {
                    // TODO: display dialog box error type, when user input is wrong format
                    JOptionPane.showMessageDialog(
                            submitButton.getParent(),
                            "Error! Phone number must be in 010-XXXX-XXXX format!",
                            "Submit Failed",
                            JOptionPane.ERROR_MESSAGE
                    );
                } else if (String.valueOf(id).length() != 8) {
                    // TODO: display dialog box error type, when user input is wrong format
                    JOptionPane.showMessageDialog(
                            submitButton.getParent(),
                            "Error! ID must be in 8 digit format!",
                            "Submit Failed",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
                // check application form
                else if (name.isEmpty()) {
                    // TODO: display dialog box warning type, when user input is not complete
                    JOptionPane.showMessageDialog(
                            submitButton.getParent(),
                            "Warning! Your sign up has not been completed, please enter your name.",
                            "Submit Failed",
                            JOptionPane.WARNING_MESSAGE
                    );
                } else {
                    // combine input result
                    String message = String.format("""
                                    Name: %s
                                    Phone: %s
                                    ID: %d
                                    Submit succeeded!
                                    """,
                            name, phone, id);
                    // TODO: display dialog box information type, when user input is all filled
                    JOptionPane.showMessageDialog(
                            submitButton.getParent(),
                            message,
                            "Submit Succeeded",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
    }
}
