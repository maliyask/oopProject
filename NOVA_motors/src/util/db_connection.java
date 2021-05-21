package util;

import java.sql.*;
import java.sql.DriverManager;

public class db_connection {
	public Connection connect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nova_motors", "root", "");

		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}

}
