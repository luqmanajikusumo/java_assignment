package com.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.DataModel;

public class DataComplement4 {
	public static void datacomplement(DataModel datamodel, String uname) throws ClassNotFoundException{
		String sql = "select username,name,photo from admintable where username='"+uname+"'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");
				Blob photo = rs.getBlob("photo");
				datamodel.setName(name);
				datamodel.setPhoto(photo);
				File image = new File("E:\\Fresh Start\\Java and DB program\\Project\\Project1\\src\\"+name+".jpg");
				try (FileOutputStream fos = new FileOutputStream(image)) {
	                   byte[] buffer = photo.getBytes(1, (int)photo.length());
	                   // Get the binary stream of our BLOB data
	                   InputStream is = rs.getBinaryStream("photo");
	                   while (is.read(buffer) > 0) {
	                       fos.write(buffer);
	                   }
	               } catch (IOException e) {
	                   e.printStackTrace();
	               }
			}
			connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
