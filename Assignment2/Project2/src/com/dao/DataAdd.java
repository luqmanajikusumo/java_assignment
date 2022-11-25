package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.DataModel;

public class DataAdd {
	public static int addrecord(DataModel datamodel,String name, String email, InputStream file)throws ClassNotFoundException{
		String sql = "insert into userrecord"
				+ "(name,email,file,comment)"
				+ " values('"+name+"','"+email+"',?,?)";
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
			System.out.println(pstmt);
			result = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return result;
		}
}
