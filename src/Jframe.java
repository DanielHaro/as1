import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Jframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 255, 255));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("num1");
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 0, 51));
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("num 2");
		panel_2.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 51, 255));
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("result");
		panel_3.add(lblNewLabel_2);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 0, 255));
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num1;
				String num2;
				double output;
				String outString = "";
				num1 = textField_1.getText() ;
				num2 = textField_2.getText();
				output = Double.parseDouble(num1) + Double.parseDouble( num2);
				outString =outString + output;
				textField.setText(outString);
				}		
			});
		
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("*");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num1;
				String num2;
				double output;
				String outString = "";
				num1 = textField_1.getText() ;
				num2 = textField_2.getText();
				output = Double.parseDouble(num1) * Double.parseDouble( num2);
				outString =outString + output;
				textField.setText(outString);
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1;
				String num2;
				double output;
				String outString = "";
				num1 = textField_1.getText() ;
				num2 = textField_2.getText();
				output = Double.parseDouble(num1) - Double.parseDouble( num2);
				outString =outString + output;
				textField.setText(outString);
				
			}
		});
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num1;
				String num2;
				double output = 0;
				String outString = "";
				num1 = textField_1.getText() ;
				num2 = textField_2.getText();
				if(Double.parseDouble(num2) != 0)
				output = Double.parseDouble(num1) / Double.parseDouble( num2);
				else
					 outString = "can not div by ";
				outString =outString + output;
				textField.setText(outString);
				
			}
		});
		
		
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("clear");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1;
				String num2;
				num1 = textField_1.getText() ;
				num2 = textField_2.getText();
				//if(Double.parseDouble(textField_2). itextField_2.getText() != )
				textField_2.setText("");
				textField_1.setText("");
				textField.setText("");
				
			}
		});
		panel_1.add(btnNewButton_4);
	}

}
