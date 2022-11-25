package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Model2;

public class TotalFood {
	public static int totalfd(Model2 datamodel,String[] food, String[] price2) throws ClassNotFoundException{
	String sql = "insert into fdselection (name,cost) values(?,?)";
	Class.forName("com.mysql.cj.jdbc.Driver");
	int result = 0;
	try{
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
		PreparedStatement pstmt = connection.prepareStatement(sql);
		for(int i=0;i<food.length;i++) {
			pstmt.setString(1, food[i]);
			pstmt.setString(2, price2[i]);
			result = pstmt.executeUpdate();
		}
	} catch (SQLException se) {
		se.printStackTrace();
	}
	return result;
	}
}
