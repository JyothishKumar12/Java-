package ecommerce_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistrationDAO {

	public static void save(Registration obj) throws SQLException {
		
	
		Connection con = DbConnection.getConnection();
//		String query="Insert into Registration values('obj.name',obj.age,'obj.email','obj.password');";
		String query = "Insert into Registration values(?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
//		Statement st = con.createStatement();
		pst.setString(1,obj.name);
		pst.setInt(2,obj.age);
		pst.setString(3,obj.email);
		pst.setString(4,obj.password);
		pst.executeUpdate();
//		st.executeUpdate(query);
		con.close();
	}
}
