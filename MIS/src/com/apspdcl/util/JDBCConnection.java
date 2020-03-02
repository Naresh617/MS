package com.apspdcl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	private static JDBCConnection jdbc;
	// JDBCSingleton prevents the instantiation from any other class.
	private JDBCConnection() {
	}
	// Now we are providing gloabal point of access.
	public static JDBCConnection getInstance() {
		if (jdbc == null) {
			jdbc = new JDBCConnection();
		}
		return jdbc;
	}

	// to get the connection from methods like insert, view etc.
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "6170");
		return con;

	}

}
