package _11JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		readData();
//		insertValues();
//		 insertValuesHardCode();
		 prempardMethodInsert();
		
	}
		
	
	
	public static void readData() throws SQLException {
		String url="jdbc:mysql://localhost:3306/SCHOOL";
		String password="123456789";
		String userName="root";
		String query ="SELECT * FROM STUDENT";
		
		Connection con =DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		ResultSet rset=st.executeQuery(query);
		
		while(rset.next()) {
		System.out.print("id is: "+ rset.getInt(1)+", ");
		System.out.print("name is: "+rset.getString(2)+", ");
		System.out.print("GPA is: "+ rset.getInt(3));
		System.out.println();
	}
		con.close();
}
	
	public static void insertValues() throws Exception {
		String url="jdbc:mysql://localhost:3306/SCHOOL";
		String password="123456789";
		String userName="root";
		String query ="insert into STUDENT values (7,'plinu',3.4);";
		
		Connection con =DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		int value=st.executeUpdate(query);
		System.out.println(value+" row is affected");
		con.close();
	}
	
	public static void insertValuesHardCode() throws Exception {
		String url="jdbc:mysql://localhost:3306/SCHOOL";
		String password="123456789";
		String userName="root";
		int id = 8;
		String name ="pihi";
		double gpa = 5.6;
		String query ="insert into STUDENT values(" +id+",'"+name+"',"+gpa+");";
		
		Connection con =DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		int value=st.executeUpdate(query);
		System.out.println(value+" row is affected");
		con.close();
	}
	
	
	public static void prempardMethodInsert() throws Exception {
		String url="jdbc:mysql://localhost:3306/SCHOOL";
		String password="123456789";
		String userName="root";
		int id = 9;
		String name ="pluh";
		double gpa = 5.9;
		String query ="insert into STUDENT values(?,?,?);";
		
		Connection con =DriverManager.getConnection(url,userName,password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2,name);
		pst.setDouble(3, gpa);
		int value=pst.executeUpdate(query);
		System.out.println(value+" row is affected");
		con.close();
	}
}