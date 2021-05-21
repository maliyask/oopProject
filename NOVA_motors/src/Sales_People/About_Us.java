package Sales_People;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class About_Us {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_Us window = new About_Us();
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
	public About_Us() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Our teams are here to help");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 50));
		lblNewLabel.setBounds(282, 29, 459, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("OUR PURPOSE");
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(45, 110, 242, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("HOW WE REACH THAT");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(45, 272, 242, 36);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("WHAT IS THE RESULT");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 205));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(45, 410, 249, 69);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("We are on a mission : ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(123, 156, 337, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Method : ");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(123, 318, 337, 36);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Solution : ");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_1_1.setBounds(123, 472, 337, 36);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JTextArea txtrTheWayWe = new JTextArea();
		txtrTheWayWe.setBackground(new Color(250, 250, 210));
		txtrTheWayWe.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtrTheWayWe.setText("The way we do it is super-transparent, safe, fast, and without any pressure, \r\nwith honest care and guidance.");
		txtrTheWayWe.setBounds(152, 363, 751, 57);
		frame.getContentPane().add(txtrTheWayWe);
		
		JTextArea txtrWeJustHappened = new JTextArea();
		txtrWeJustHappened.setBackground(new Color(250, 250, 210));
		txtrWeJustHappened.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtrWeJustHappened.setText("We just happened to create a brand new used - car buying and selling platform with \r\nmore than 5000 top - condition 150 point inspected cars, a home delivery option, \r\nand a 14-day money-back guarantee. ");
		txtrWeJustHappened.setBounds(164, 518, 740, 64);
		frame.getContentPane().add(txtrWeJustHappened);
		
		JTextArea txtrWeBelieveThat = new JTextArea();
		txtrWeBelieveThat.setBackground(new Color(250, 250, 210));
		txtrWeBelieveThat.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtrWeBelieveThat.setText("We believe that everyone should have the right to buy and sell used cars in a fair way,\r\n without shady tactics.");
		txtrWeBelieveThat.setBounds(163, 202, 740, 50);
		frame.getContentPane().add(txtrWeBelieveThat);
	}
}
