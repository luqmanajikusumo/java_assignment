package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Model2;

public class UserProfile {
	public static void userprofile(Model2 datamodel, String uname) throws ClassNotFoundException{
		String sql = "select username,password,firstname,lastname,address,email,phone from usertable where username='"+uname+"'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String password = rs.getString("password");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String address = rs.getString("address");			
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				datamodel.setUname(uname);
				datamodel.setPass(password);
				datamodel.setName(firstname+" "+lastname);
				datamodel.setAddress(address);
				datamodel.setPhone(phone);
				datamodel.setEmail(email);
			}
			connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
