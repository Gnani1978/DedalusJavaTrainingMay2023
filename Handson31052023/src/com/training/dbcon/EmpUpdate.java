package com.training.dbcon;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpUpdate {
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;

	public void updateEmployee(Employee emp) 
	{
		con = DBConnection.getMyConnection();
		try {

			ps = con.prepareStatement("update EMP set EMPname = ? where EMPno = ?");
			ps.setString(1, emp.getEname());
			ps.setInt(2, emp.getEmpno());

			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " employee(s) updated successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
