package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Model2;

public class UserForwarder {
	public static void uforwarder(Model2 datamodel, String uname) throws ClassNotFoundException{
		String sql = "select username,firstname,lastname from usertable where username='"+uname+"'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				datamodel.setName(firstname+" "+lastname);
			}
			connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
