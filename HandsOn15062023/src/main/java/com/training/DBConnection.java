package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBConnection {
	static Connection con;
	public String cString;
	public String cName;
	public String pWord; 
	
	public String getcString() {
		return cString;
	}


	public void setcString(String cString) {
		this.cString = cString;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getpWord() {
		return pWord;
	}


	public void setpWord(String pWord) {
		this.pWord = pWord;
	}


	public Connection getMyConnection() {
		
		try {
			con = DriverManager.getConnection(cString, cName, pWord);
			System.out.println(con);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;
	}
	

	public static void main(String[] args) {
		ApplicationContext AC = new ClassPathXmlApplicationContext("db.xml");
		DBConnection DB = (DBConnection) AC.getBean("cI");
		System.out.println(DB.getMyConnection());

	}

}