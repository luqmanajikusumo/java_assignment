package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.DataModel;

public class DeleteRecord {
	public static int deleterecord(DataModel datamodel) throws ClassNotFoundException{
		String sql = "delete from userrecord"
				+ " where id=?";
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","root");
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, datamodel.getId());
			System.out.println(pstmt);
			result = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return result;
	}
}
