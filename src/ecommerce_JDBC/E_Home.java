package ecommerce_JDBC;

import java.sql.SQLException;

public class E_Home {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Registration rg = new Registration();
		RegistrationDAO.save(rg);
	}

}
