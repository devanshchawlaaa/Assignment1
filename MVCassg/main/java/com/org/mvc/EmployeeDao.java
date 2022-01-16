package com.org.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDao {

	
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		
		String INSERT_USERS_SQL = "INSERT INTO employee" +
		" (first_name, last_name, username, password ,address ,contact ) VALUES "+
				"(?,?,?,?,?,?);";
		
		int result=0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/loginpage","root","root"); 
			
			PreparedStatement ps = con.prepareStatement(INSERT_USERS_SQL);
		
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setString(3, employee.getUsername());
			ps.setString(4, employee.getPassword());
			ps.setString(5, employee.getAddress());
			ps.setString(6, employee.getContact());
			
			System.out.println(ps);
			
			result= ps.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return result;
	}
	
}
