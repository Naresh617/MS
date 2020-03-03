package com.apspdcl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	private static Connection conn = null;

	public static Connection getConnection() throws Exception {
		if (conn == null) {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String userName = "naresh";
			String password = "naresh";

			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, userName, password);
		}

		return conn;
	}
	
	public static void closeConnection(Connection conn) {

        try {

            conn.close();

        } catch (SQLException e) {

        }

    }

}
