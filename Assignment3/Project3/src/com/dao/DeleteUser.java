package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Model2;

public class DeleteUser {
	public static int deleteuser(Model2 datamodel, String uname) throws ClassNotFoundException{
		String sql = "delete from usertable"
				+ " where username='"+uname+"'";
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
			PreparedStatement pstmt = connection.prepareStatement(sql);
			System.out.println(pstmt);
			result = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return result;
	}
}
