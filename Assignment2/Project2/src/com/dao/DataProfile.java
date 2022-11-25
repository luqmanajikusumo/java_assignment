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

public class DataProfile {
	public static void userprofile(DataModel datamodel, String uname) throws ClassNotFoundException{
		String sql = "select name,email,address,phone,city,country,photo from usertable where username='"+uname+"'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String phone = rs.getString("phone");
				String city = rs.getString("city");
				String country = rs.getString("country");
				Blob photo = rs.getBlob("photo");
				datamodel.setName(name);
				datamodel.setEmail(email);
				datamodel.setAddress(address);
				datamodel.setPhone(phone);
				datamodel.setCity(city);
				datamodel.setCountry(country);
				datamodel.setPhoto(photo);
				File image = new File("E:\\Fresh Start\\Java and DB program\\Project\\Project2\\src\\"+name+".jpg");
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
