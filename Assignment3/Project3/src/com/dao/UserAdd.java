package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Model2;

public class UserAdd {
	public static int registeruser(Model2 datamodel)throws ClassNotFoundException{
		String sql = "insert into usertable"
				+ "(username,password,firstname,lastname,address,phone,email)"
				+ " values (?,?,?,?,?,?,?)";
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, datamodel.getUname());
			pstmt.setString(2, datamodel.getPass());
			pstmt.setString(3, datamodel.getFirstName());
			pstmt.setString(4, datamodel.getLastName());
			pstmt.setString(5, datamodel.getAddress());
			pstmt.setString(6, datamodel.getPhone());
			pstmt.setString(7, datamodel.getEmail());
			System.out.println(pstmt);
			result = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return result;
		}
}
