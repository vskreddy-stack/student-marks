package cylone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import jdbc.ConnectionJdbc;

public class Cylonedata {
	

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnSubmit;
	private JTextField textField_4;
	private JLabel lblEnteredData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cylonedata window = new Cylonedata();
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
	public Cylonedata() {
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
		
		JLabel lblNewLabel = new JLabel("student name:");
		lblNewLabel.setBounds(0, 13, 98, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String name=textField.getText();
			}
		});
		textField.setBounds(193, 10, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("maths marks");
		lblNewLabel_1.setBounds(0, 42, 98, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String maths=textField_1.getText();
				Double num1=Double.parseDouble(maths);
			}
		});
		textField_1.setBounds(193, 36, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("english marks");
		lblNewLabel_2.setBounds(0, 71, 98, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String english=textField_2.getText();
				Double num2=Double.parseDouble(english);
			}
		});
		textField_2.setBounds(193, 68, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel(" science marks");
		lblNewLabel_3.setBounds(0, 100, 98, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String science=textField_3.getText();
				Double num3=Double.parseDouble(science);
				
				
				
				textField_3.toString();
			}
		});
		textField_3.setBounds(193, 97, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSubmit.setText("thankyou");
			//	System.out.println(textField_1.getText()+""+textField_2.getText()+""+textField_3.getText());
				ConnectionJdbc.insertValues(textField.getText(),Double.parseDouble(textField_1.getText()),Double.parseDouble(textField_2.getText()),Double.parseDouble( textField_3.getText()),Double.parseDouble (textField_4.getText()));
			}
		});
		btnSubmit.setBounds(0, 215, 420, 38);
		frame.getContentPane().add(btnSubmit);
		
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String social=textField_2.getText();
				Double num4=Double.parseDouble(social);
				
			}
		});
		textField_4.setBounds(193, 132, 116, 21);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblEnteredData = new JLabel("social marks");
		lblEnteredData.setBounds(0, 137, 86, 16);
		frame.getContentPane().add(lblEnteredData);
	}
}
