package com.sungju.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnector {

	public static Connection getConnect() throws Exception {
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection con = null;
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);

		return con;
	}

}