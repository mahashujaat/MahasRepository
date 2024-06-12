package lmsproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ReturnBooks {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnBooks window = new ReturnBooks();
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
	public ReturnBooks() {
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
		
		JLabel lblNewLabel = new JLabel("Return Book");
		lblNewLabel.setBounds(165, 28, 103, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWhichBookDo = new JLabel("Which Book do you want to return?");
		lblWhichBookDo.setBounds(115, 83, 201, 20);
		frame.getContentPane().add(lblWhichBookDo);
		
		textField = new JTextField();
		textField.setBounds(167, 132, 133, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Book Id:");
		lblNewLabel_1.setBounds(89, 135, 115, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(214, 177, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton Back = new JButton("<");
		Back.setBounds(10, 11, 41, 23);
		frame.getContentPane().add(Back);
	}

}
