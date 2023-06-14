package com.training.dbcon;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static Connection con;
	
	public static Connection getMyConnection() {

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sa", "K10*");
			System.out.println(con);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}
	

	public static void main(String[] args) {
		System.out.println(getMyConnection());

	}

}
