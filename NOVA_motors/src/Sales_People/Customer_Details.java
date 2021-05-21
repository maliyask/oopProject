package Sales_People;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import model.Customers;

import util.db_connection;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Customer_Details extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fm;
	private JTextField gn;
	private JTextField sn;
	private JTextField dob;
	private JTextField em;
	private JTextField cno;
	private JTextField ad;
	private JTextField nic;

	db_connection DBConnection = new db_connection();
	Customers cus = new Customers();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Details frame = new Customer_Details();
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
	public Customer_Details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Customer");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(29, 35, 227, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("First Name : ");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(75, 114, 139, 20);
		contentPane.add(lblNewLabel_2);
		
		fm = new JTextField();
		fm.setColumns(10);
		fm.setBounds(248, 114, 180, 19);
		contentPane.add(fm);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//	READ THE TEXTBOX VALUES 
				String fname = fm.getText();
				//CALL THE INSERTcUSTOMER IN Customers class by passing the parameters
				cus.insertCustomerDetails(fname,sn.getText(),gn.getText(),dob.getText(),em.getText(),Integer.parseInt(cno.getText()),ad.getText(),nic.getText() );
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 205));
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setFont(new Font("STZhongsong", Font.BOLD, 20));
		btnNewButton.setBounds(758, 521, 163, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("Surname : ");
		lblNewLabel_2_1.setForeground(Color.BLUE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(75, 203, 139, 20);
		contentPane.add(lblNewLabel_2_1);
		
		gn = new JTextField();
		gn.setColumns(10);
		gn.setBounds(248, 293, 180, 19);
		contentPane.add(gn);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Gender : ");
		lblNewLabel_2_1_1.setForeground(Color.BLUE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(75, 292, 139, 20);
		contentPane.add(lblNewLabel_2_1_1);
		
		sn = new JTextField();
		sn.setColumns(10);
		sn.setBounds(248, 204, 180, 19);
		contentPane.add(sn);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("D.O.B : ");
		lblNewLabel_2_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_1.setBounds(75, 389, 139, 20);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		dob = new JTextField();
		dob.setColumns(10);
		dob.setBounds(248, 390, 180, 19);
		contentPane.add(dob);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Email : ");
		lblNewLabel_2_1_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_1_1.setBounds(592, 114, 139, 20);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		em = new JTextField();
		em.setColumns(10);
		em.setBounds(741, 114, 180, 19);
		contentPane.add(em);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact No : ");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(593, 203, 152, 20);
		contentPane.add(lblNewLabel_1_1);
		
		cno = new JTextField();
		cno.setColumns(10);
		cno.setBounds(746, 204, 180, 19);
		contentPane.add(cno);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Address : ");
		lblNewLabel_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(593, 292, 110, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		ad = new JTextField();
		ad.setColumns(10);
		ad.setBounds(746, 297, 180, 19);
		contentPane.add(ad);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("NIC No : ");
		lblNewLabel_1_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(593, 385, 110, 20);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		nic = new JTextField();
		nic.setColumns(10);
		nic.setBounds(746, 385, 180, 19);
		contentPane.add(nic);
	}
}
