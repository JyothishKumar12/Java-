package ecommerce_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static final String url ="jdbc:mysql://localhost:3306/Ecommerce";
	private static final String userName="root";
	private static final String password="123456789";
	
	public static Connection getConnection() throws SQLException {
	return DriverManager.getConnection(url,userName,password);
	}
}
