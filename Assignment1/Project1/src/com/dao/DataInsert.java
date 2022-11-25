package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.DataModel;

public class DataInsert {
	public static int registeruser(DataModel datamodel, InputStream file) throws ClassNotFoundException{
		String sql = "insert into registrationtable"
				+ "(name,email,address,phone,city,country,education,photo)"
				+ " values (?,?,?,?,?,?,?,?)";
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
			System.out.println(pstmt);
			result = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return result;
	}
}
