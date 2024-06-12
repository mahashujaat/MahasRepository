package lmsproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Users {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Users window = new Users();
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
	public Users() {
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
		
		JLabel lblNewLabel = new JLabel("Add User");
		lblNewLabel.setBounds(74, 33, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("View User");
		lblNewLabel_1.setBounds(273, 7, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton Back = new JButton("<");
		Back.setBounds(10, 7, 46, 23);
		frame.getContentPane().add(Back);
		
		JButton btnNewButton_1 = new JButton("Add User");
		btnNewButton_1.setBounds(74, 186, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		table = new JTable();
		table.setBounds(192, 24, 232, 226);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setBounds(10, 82, 55, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email");
		lblNewLabel_2_1.setBounds(10, 114, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Password");
		lblNewLabel_2_2.setBounds(10, 145, 55, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBounds(75, 79, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(74, 111, 86, 20);
		frame.getContentPane().add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(74, 142, 87, 20);
		frame.getContentPane().add(passwordField);
	}

}
