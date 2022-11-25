package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.DataModel;

public class DataEdit {
	public static int editrecord(DataModel datamodel, InputStream file)throws ClassNotFoundException{
		String sql = "update userrecord set file=?,comment=? where id=?";
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","root");
			PreparedStatement pstmt = connection.prepareStatement(sql);
			if (file != null) {  
	            // Fetches the input stream
	            // of the upload file for
	            // the blob column
				pstmt.setBlob(1, file);
	        }
			pstmt.setString(2, datamodel.getComment());
			pstmt.setString(3, datamodel.getId());
			System.out.println(pstmt);
			result = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return result;
		}
}
