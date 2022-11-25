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

import com.model.Model2;

public class MedicalView {
	public static void medview(Model2 datamodel) throws ClassNotFoundException{
		String sql = "select id,name,image,cost from medtable";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				Blob image = rs.getBlob("image");
				String price = rs.getString("cost");
				datamodel.setId(id);
				datamodel.setName(name);
				datamodel.setImage(image);
				datamodel.setPrice(price);
				File img = new File("E:\\Fresh Start\\Java and DB program\\Project\\Project3\\src\\"+name+".jpg");
				try (FileOutputStream fos = new FileOutputStream(img)) {
	                   byte[] buffer = image.getBytes(1, (int)image.length());
	                   // Get the binary stream of our BLOB data
	                   InputStream is = rs.getBinaryStream("image");
	                   while (is.read(buffer) > 0) {
	                       fos.write(buffer);
	                   }
	               } catch (IOException e) {
	                   e.printStackTrace();
	               }
				datamodel.setPrice(price);
			}
			connection.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
