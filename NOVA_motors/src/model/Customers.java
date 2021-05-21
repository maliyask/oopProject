package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import util.db_connection;

public class Customers {

	private int customerID;
	private String firstName;
	private String surname;
	private String gender;
	private String dateOfBirth;
	private String email;
	private String contactNumber;
	private String address;
	private String nicNumber;

	// connection object
	db_connection dbConnection = new db_connection();

	// constructor
	public Customers() {
	}

	public Customers(int customerID, String firstName, String surname, String gender, String dateOfBirth, String email,
			String contactNumber, String address, String nicNumber) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.surname = surname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		this.nicNumber = nicNumber;
	}

	// method to insert customer details
	public String insertCustomerDetails(String firstName, String surname, String gender, String dob, String email,
			int contactNumber, String address, String nicNumber) {
		String output = "";

		try {
			Connection conn = dbConnection.connect();
			if (conn == null) {
				System.out.println(" Error while Connecting to the database");
			}

			String query = "insert into customer_detail values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedstatement = conn.prepareStatement(query);

			// generate a customer id

			preparedstatement.setInt(1, 0); // need to update --> done
			preparedstatement.setString(2, firstName);
			preparedstatement.setString(3, surname);
			preparedstatement.setString(4, gender);

			// convert string to date ....

			preparedstatement.setString(5, dob);

			preparedstatement.setString(6, email);
			preparedstatement.setInt(7, contactNumber);
			preparedstatement.setString(8, address);
			preparedstatement.setString(9, nicNumber);

			preparedstatement.execute();
			conn.close();

			output = "Inserted SuccessFully";

		} catch (Exception e) {

			output = "Error while Inserting ";
			e.printStackTrace();
		}

		return output;
	}

	// method to view all customer details
	public List<Customers> readAllCustomers() {

		// create new customer list
		List<Customers> customersList = new ArrayList<Customers>();
		Customers customer = null;

		try {
			Connection conn = dbConnection.connect();
			if (conn == null) {
				System.out.println(" Error while Connecting to the database");
			}

			String query = "select * from customer_detail";
			Statement stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(query);

			while (resultSet.next()) {

				int customerId = resultSet.getInt("Customer_ID");
				String fname = resultSet.getString("First_name");
				String surname = resultSet.getString("Surname");
				String gender = resultSet.getString("Gender");
				String dob = resultSet.getString("D.O.B.");
				String email = resultSet.getString("Email");
				String contactNumber = resultSet.getString("Contact_No");
				String address = resultSet.getString("Address");
				String nic = resultSet.getString("NIC_No");

				customer = new Customers(customerId, fname, surname, gender, dob, email, contactNumber, address, nic);
				customersList.add(customer);

			}

			conn.close();

		} catch (Exception e) {

			System.out.println("Error while Inserting ");
			e.printStackTrace();
		}

		return customersList;
	}

	// method to read one Customer Details
	public Customers readoneCustomer(int custId) {
		Customers customer = null;

		try {
			Connection conn = dbConnection.connect();
			if (conn == null) {
				System.out.println(" Error while Connecting to the database");
			}

			String query = "select * from customer_detail where Customer_ID=" + custId;
			Statement stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(query);

			while (resultSet.next()) {

				int customerId = resultSet.getInt("Customer_ID");
				String fname = resultSet.getString("First_name");
				String surname = resultSet.getString("Surname");
				String gender = resultSet.getString("Gender");
				String dob = resultSet.getString("D.O.B.");
				String email = resultSet.getString("Email");
				String contactNumber = resultSet.getString("Contact_No");
				String address = resultSet.getString("Address");
				String nic = resultSet.getString("NIC_No");

				customer = new Customers(customerId, fname, surname, gender, dob, email, contactNumber, address, nic);

			}

			conn.close();

		} catch (Exception e) {

			System.out.println("Error while Inserting ");
			e.printStackTrace();
		}

		return customer;
	}

	// method to update customer details
	public boolean updateCustomer(int customerId, String fname, String surName, String gender, String dob, String email,
			int contactNumber, String address, String nic) {
		boolean flag = false;

		try {
			Connection conn = dbConnection.connect();
			if (conn == null) {
				System.out.println(" Error while Connecting to the database");
			}

			String query = "update customer_detail set First_name=?, Surname=?, Gender =? , D.O.B.=? , Email=?, Contact_No=?,Address=?,NIC_No=? where Customer_ID=?";
			
			PreparedStatement stmt = conn.prepareStatement(query);
			
			//binding values
			stmt.setString(1, fname);
			stmt.setString(2, surName);
			stmt.setString(3, gender);
			stmt.setString(4, dob);
			stmt.setString(5, email);
			stmt.setInt(6, contactNumber);
			stmt.setString(7, address);
			stmt.setString(8, nic);
			stmt.setInt(9, customerId);
			
			stmt.execute();

			flag = true;

			// close the connection

			conn.close();			
			
		} catch (Exception e) {

		}

		return flag;
	}
	
	
	public boolean deleteCustomr(int customerId) {
		boolean flag = false;
		try {
			Connection conn = dbConnection.connect();
			if (conn == null) {
				System.out.println(" Error while Connecting to the database");
			}
			
			String query = "Delete from customer_detail where Customer_ID="+customerId;
			PreparedStatement stmt = conn.prepareStatement(query);
			
			stmt.executeUpdate();
			conn.close();
			
			flag = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
	
		return flag;
	}

}
