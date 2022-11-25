package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.DataModel;

public class DataEntry {
	public static int registeruser(DataModel datamodel,InputStream file)throws ClassNotFoundException{
	String sql = "insert into usertable"
			+ "(name,email,username,password,photo,phone,address,city,country)"
			+ " values (?,?,?,?,?,?,?,?,?)";
	int result = 0;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try{
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","root");
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, datamodel.getName());
		pstmt.setString(2, datamodel.getEmail());
		pstmt.setString(3, datamodel.getUname());
		pstmt.setString(4, datamodel.getPass());
		if (file != null) {  
            // Fetches the input stream
            // of the upload file for
            // the blob column
            pstmt.setBlob(5, file);
        }
		pstmt.setString(6, datamodel.getPhone());
		pstmt.setString(7, datamodel.getAddress());
		pstmt.setString(8, datamodel.getCity());
		pstmt.setString(9, datamodel.getCountry());
		System.out.println(pstmt);
		result = pstmt.executeUpdate();
	} catch (SQLException se) {
		se.printStackTrace();
	}
	return result;
	}
}
