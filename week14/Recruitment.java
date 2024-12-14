/*
 * Name: Kim Ji Yun
 * ID: 20012168
 */
package assign04;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// extends JFrame to use its methods
public class Recruitment extends JFrame {
    private String name;
    private String university;
    private String major;
    private String email;
    private String work;
    private String language;
    private File cv;
    private String post;
    private String level;

    public static void main(String[] args) {
        // ensure code runs on Event Dispatch Thread
        EventQueue.invokeLater(() -> {
            try {
                Recruitment recruitFrame = new Recruitment();
                // display frame
                recruitFrame.setVisible(true);
            } catch (Exception e) {
                // show detailed error information
                e.printStackTrace();
            }
        });
    }

    public Recruitment() {
        // TODO: Frame settings
        setSize(750, 650);
        setLocationRelativeTo(null);
        setLayout(null);
        // manage memory on close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: Title label settings
        JLabel titleLabel = new JLabel("Tech World Recruitment", JLabel.CENTER);
        titleLabel.setBounds(200, 10, 300, 30);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(titleLabel);

        // TODO: Applicant Name settings
        JLabel nameLabel = new JLabel("Applicant Name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel.setBounds(50, 60, 200, 25);
        add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(250, 60, 150, 25);
        add(nameField);

        // TODO: Applicant University settings
        JLabel universityLabel = new JLabel("Applicant University");
        universityLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        universityLabel.setBounds(50, 100, 200, 25);
        add(universityLabel);
        JTextField universityField = new JTextField();
        universityField.setBounds(250, 100, 150, 25);
        add(universityField);

        // TODO: Applicant Major settings
        JLabel majorLabel = new JLabel("Applicant Major");
        majorLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        majorLabel.setBounds(50, 140, 200, 25);
        add(majorLabel);
        JTextField majorField = new JTextField();
        majorField.setBounds(250, 140, 150, 25);
        add(majorField);

        // TODO: Applicant Email settings
        JLabel emailLabel = new JLabel("Applicant Email");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel.setBounds(50, 180, 200, 25);
        add(emailLabel);
        JTextField emailField = new JTextField();
        emailField.setBounds(250, 180, 150, 25);
        add(emailField);

        // TODO: Work Experience settings
        JLabel workLabel = new JLabel("Work Experience");
        workLabel.setBounds(50, 220, 200, 25);
        workLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        add(workLabel);
        JTextArea workArea = new JTextArea();
        JScrollPane workScroll = new JScrollPane(workArea);
        workScroll.setBounds(250, 220, 300, 100);
        // Work Experience Scrollbar Additional settings
        workScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        workScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        workScroll.getVerticalScrollBar().setEnabled(false);
        workScroll.getHorizontalScrollBar().setEnabled(false);
        add(workScroll);
        // Work Experience Scrollbar Document Listener settings
        workArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                enableScrollBars();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                enableScrollBars();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                enableScrollBars();
            }

            // enable scroll bars when document event generated
            private void enableScrollBars() {
                workScroll.getVerticalScrollBar().setEnabled(true);
                workScroll.getHorizontalScrollBar().setEnabled(true);
            }
        });

        // TODO: Programming Language settings
        JLabel programLabel = new JLabel("Programming Language");
        programLabel.setBounds(50, 340, 200, 25);
        programLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        add(programLabel);
        // Programming Language Checkbox Additional settings
        JCheckBox cBox = new JCheckBox("C");
        cBox.setBounds(250, 340, 50, 25);
        add(cBox);
        JCheckBox javaBox = new JCheckBox("Java");
        javaBox.setBounds(310, 340, 60, 25);
        add(javaBox);
        JCheckBox cppBox = new JCheckBox("C++");
        cppBox.setBounds(380, 340, 60, 25);
        add(cppBox);
        JCheckBox pythonBox = new JCheckBox("Python");
        pythonBox.setBounds(450, 340, 80, 25);
        add(pythonBox);

        // TODO: Upload CV settings
        JLabel uploadLabel = new JLabel("Upload CV");
        uploadLabel.setBounds(50, 380, 200, 25);
        uploadLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        add(uploadLabel);
        JButton uploadButton = new JButton("Upload File");
        uploadButton.setBounds(250, 380, 100, 25);
        add(uploadButton);
        // Upload File Button Action Listener settings
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // choose file to upload
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                // check file upload status and display dialog box
                if (result == JFileChooser.APPROVE_OPTION) {
                    cv = fileChooser.getSelectedFile();
                    String message = String.format("Your CV is successfully uploaded.\n"
                            + "File Uploaded from: %s", cv.getAbsolutePath());
                    // display dialog box, when succeeded
                    JOptionPane.showMessageDialog(
                            uploadButton.getParent(),
                            message,
                            "CV Uploaded",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    // display dialog box, when failed
                    JOptionPane.showMessageDialog(
                            uploadButton.getParent(),
                            "Warning! CV upload failed, Try Again.",
                            "CV Upload Failed",
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        });

        // TODO: Select Post settings
        JLabel postLabel = new JLabel("Select Post");
        postLabel.setBounds(50, 420, 200, 25);
        postLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        add(postLabel);
        // Programmer Post Radiobutton Additional settings
        JRadioButton javaProgrammer = new JRadioButton("Java Programmer");
        javaProgrammer.setBounds(250, 420, 150, 25);
        JRadioButton pythonProgrammer = new JRadioButton("Python Programmer");
        pythonProgrammer.setBounds(400, 420, 150, 25);
        ButtonGroup postButtons = new ButtonGroup();
        postButtons.add(javaProgrammer);
        postButtons.add(pythonProgrammer);
        add(javaProgrammer);
        add(pythonProgrammer);

        //TODO: Select Job Level settings
        JLabel jobLabel = new JLabel("Select Job Level");
        jobLabel.setBounds(50, 460, 200, 25);
        jobLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        add(jobLabel);
        JComboBox<String> jobCombo = new JComboBox<>(
                new String[]{"Entry level", "3+ years experience", "5+ years experience"});
        jobCombo.setBounds(250, 460, 150, 25);
        add(jobCombo);

        // TODO: Buttons settings
        JButton clearButton = new JButton("Clear All");
        clearButton.setBounds(50, 560, 100, 25);
        add(clearButton);
        // Clear Button Action Listener settings
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // clear text input
                nameField.setText("");
                universityField.setText("");
                majorField.setText("");
                emailField.setText("");
                workArea.setText("");
                // clear selection input
                cBox.setSelected(false);
                javaBox.setSelected(false);
                cppBox.setSelected(false);
                pythonBox.setSelected(false);
                postButtons.clearSelection();
                jobCombo.setSelectedIndex(0);
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(300, 560, 100, 25);
        add(exitButton);
        // Exit Button Action Listener settings
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton submitButton = new JButton("Submit Application");
        submitButton.setBounds(550, 560, 150, 25);
        add(submitButton);
        // Submit Button Action Listener settings
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // save user input data
                name = nameField.getText();
                university = universityField.getText();
                major = majorField.getText();
                email = emailField.getText();
                work = workArea.getText();
                // check multiple languages
                language = "";
                language += cBox.isSelected() ? "C " : "";
                language += javaBox.isSelected() ? "Java " : "";
                language += cppBox.isSelected() ? "C++ " : "";
                language += pythonBox.isSelected() ? "Python " : "";
                // check post selection
                post = javaProgrammer.isSelected() ? "Java" : "Python";
                post = !javaProgrammer.isSelected() && !pythonProgrammer.isSelected() ? "" : post;
                level = jobCombo.getSelectedItem().toString();
                // combine input result
                String message = String.format("""
                                Name: %s
                                Email: %s
                                Languages: %s
                                Post: %s
                                Job Level: %s
                                Your application is successfully received.
                                """,
                        name, email, language, post, level);
                // check application form
                if (name.isEmpty() || email.isEmpty() || language.isEmpty() || post.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            submitButton.getParent(),
                            "Warning! Your Application is not completed, Try Again.",
                            "Application Submit Failed",
                            JOptionPane.WARNING_MESSAGE
                    );
                } else {
                    // display dialog box, when applications are filled
                    JOptionPane.showMessageDialog(
                            submitButton.getParent(),
                            message,
                            "Application Submitted",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
    }
}
