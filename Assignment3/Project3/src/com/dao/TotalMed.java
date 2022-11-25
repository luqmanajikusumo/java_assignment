package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Model2;

public class TotalMed {
	public static int totalmed(Model2 datamodel,String[] med, String[] price2) throws ClassNotFoundException{
	String sql = "insert into medselection (name,cost) values(?,?)";
	Class.forName("com.mysql.cj.jdbc.Driver");
	int result = 0;
	try{
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
		PreparedStatement pstmt = connection.prepareStatement(sql);
		for(int i=0;i<med.length;i++) {
			pstmt.setString(1, med[i]);
			pstmt.setString(2, price2[i]);
			result = pstmt.executeUpdate();
		}
	} catch (SQLException se) {
		se.printStackTrace();
	}
	return result;
	}
}
