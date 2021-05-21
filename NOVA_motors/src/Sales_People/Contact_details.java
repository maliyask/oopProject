package Sales_People;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;

public class Contact_details {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact_details window = new Contact_details();
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
	public Contact_details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Want to get in touch.?    We'd love to hear from you.  \r\n\r\n\r\n");
		lblNewLabel.setFont(new Font("STZhongsong", Font.PLAIN, 25));
		lblNewLabel.setBounds(158, 58, 937, 68);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Get in touch\r\n");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(357, 19, 349, 87);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblHeresHowYou = new JLabel("Here's how you can reach us...");
		lblHeresHowYou.setFont(new Font("STZhongsong", Font.PLAIN, 25));
		lblHeresHowYou.setBounds(299, 116, 411, 24);
		frame.getContentPane().add(lblHeresHowYou);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Contact_details.class.getResource("/image/1.png")));
		lblNewLabel_2.setBounds(129, 188, 226, 214);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Contact_details.class.getResource("/image/2.jpg")));
		lblNewLabel_3.setBounds(604, 188, 226, 214);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(471, 175, 2, 428);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("Talk to sales");
		lblNewLabel_4.setForeground(new Color(0, 128, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(187, 397, 171, 78);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Contact customer support");
		lblNewLabel_4_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_1.setBounds(588, 397, 275, 78);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("+94 714568412");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_5.setBounds(144, 464, 303, 59);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("+94 774558445");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_5_1.setBounds(624, 464, 303, 59);
		frame.getContentPane().add(lblNewLabel_5_1);
	}
}
