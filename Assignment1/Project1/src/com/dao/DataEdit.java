package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.DataModel;

public class DataEdit {
	public static int edituser(DataModel datamodel,InputStream file) throws ClassNotFoundException{
		String sql = "update registrationtable"
				+ " set name=?,email=?,address=?,phone=?,city=?,country=?,education=?,photo=? where id=?";
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root");
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, datamodel.getName());
			pstmt.setString(2, datamodel.getEmail());
			pstmt.setString(3, datamodel.getAddress());
			pstmt.setString(4, datamodel.getPhone());
			pstmt.setString(5, datamodel.getCity());
			pstmt.setString(6, datamodel.getCountry());
			pstmt.setString(7, datamodel.getEducation());
			if (file != null) {  
                // Fetches the input stream
                // of the upload file for
                // the blob column
                pstmt.setBlob(8, file);
            }
			pstmt.setString(9, datamodel.getId());
			System.out.println(pstmt);
			result = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return result;
	}
}
