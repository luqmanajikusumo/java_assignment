package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.DataModel;

public class DataLogin {
	public static boolean loginuser(DataModel loginuser) throws ClassNotFoundException{
		String sql = "select username,password from usertable "
				+ "where username = ? and password = ?";
		boolean status = false; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","root");
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, loginuser.getUname());
			pstmt.setString(2, loginuser.getPass());
			ResultSet rs = pstmt.executeQuery();
			status = rs.next();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return status;
	}
}
