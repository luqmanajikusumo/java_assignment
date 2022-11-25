package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.Arrays;

import com.model.Model2;

public class TotalEdu {
	public static int totaledu(Model2 datamodel,String[] edu, String[] price2) throws ClassNotFoundException{
		String sql = "insert into eduselection (name,cost) values(?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		int result = 0;
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
			PreparedStatement pstmt = connection.prepareStatement(sql);
			for(int i=0;i<edu.length;i++) {
				pstmt.setString(1, edu[i]);
				pstmt.setString(2, price2[i]);
				result = pstmt.executeUpdate();
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return result;
	}
	
}
