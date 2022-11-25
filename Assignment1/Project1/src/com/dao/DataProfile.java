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
	public static void userprofile(DataModel datamodel, String id) throws ClassNotFoundException{
		String sql = "select id,name,email,address,phone,city,country,education,photo from registrationtable where id="+id;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String cid = rs.getString("id");
				String cname = rs.getString("name");
				String cemail = rs.getString("email");
				String caddress = rs.getString("address");
				String cphone = rs.getString("phone");
				String ccity = rs.getString("city");
				String ccountry = rs.getString("country");
				String ceducation = rs.getString("education");
				Blob cphoto = rs.getBlob("photo");
				datamodel.setId(cid);
				datamodel.setName(cname);
				datamodel.setEmail(cemail);
				datamodel.setAddress(caddress);
				datamodel.setPhone(cphone);
				datamodel.setCity(ccity);
				datamodel.setCountry(ccountry);
				datamodel.setEducation(ceducation);
				datamodel.setPhoto(cphoto);
				File image = new File("E:\\Fresh Start\\Java and DB program\\Project\\Project1\\src\\_"+cid+".jpg");
				try (FileOutputStream fos = new FileOutputStream(image)) {
	                   byte[] buffer = cphoto.getBytes(1, (int)cphoto.length());
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
