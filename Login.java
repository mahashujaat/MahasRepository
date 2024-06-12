package lmsproject;

import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

    private JFrame frame;
    private JPasswordField passwordField;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setBounds(192, 34, 46, 14);
        frame.getContentPane().add(lblNewLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(174, 159, 218, 20);
        frame.getContentPane().add(passwordField);

        textField = new JTextField();
        textField.setBounds(174, 78, 218, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(174, 121, 218, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Username:");
        lblNewLabel_1.setBounds(71, 81, 73, 14);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Email:");
        lblNewLabel_2.setBounds(71, 124, 46, 14);
        frame.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Password:");
        lblNewLabel_2_1.setBounds(71, 162, 73, 14);
        frame.getContentPane().add(lblNewLabel_2_1);

        JButton btnNewButton = new JButton("Login");
        btnNewButton.setBounds(303, 201, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JButton Back = new JButton("<");
        Back.setBounds(10, 11, 41, 23);
        frame.getContentPane().add(Back);

        // Adding ActionListener to the Login button
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                String password = new String(passwordField.getPassword());
                String email = textField_1.getText();

                // Check if username, password, and email match the criteria
                if (username.equals("admin") && password.equals("admin") && email.equals("admin@gmail.com")) {
                    // Open Adminfunctions window
                	Adminfunctions adminFunctions = new Adminfunctions();
                	adminFunctions.getFrame().setVisible(true);

                    // Close the Login window
                    frame.dispose();
                } else {
                    // Show error message
                    System.out.println("Invalid credentials");
                }
            }
        });
    }

	public Window getFrame() {
		// TODO Auto-generated method stub
		return null;
	}
}
