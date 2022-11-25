package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Model2;

public class AdminLogin {
	public static boolean loginadmin(Model2 datamodel) throws ClassNotFoundException{
		String sql = "select username,password from admintable "
				+ "where username = ? and password = ?";
		boolean status = false; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, datamodel.getUname());
			pstmt.setString(2, datamodel.getPass());
			ResultSet rs = pstmt.executeQuery();
			status = rs.next();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return status;
		}
}
