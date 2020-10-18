package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLCon {
	
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/flight_system";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "cdac";
	
	private Connection conn;
	
	public Connection getConn(){
		
		try {
			if(conn == null || conn.isClosed()) {
				Class.forName(DRIVER_CLASS);
				conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;

	
	
	}
	
}
