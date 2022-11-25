package com.info;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.DataEntry;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet1
 */
@MultipartConfig(maxFileSize = 16177215)
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("password");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		
		DataModel datamodel = new DataModel();
		datamodel.setName(name);
		datamodel.setEmail(email);
		datamodel.setUname(uname);
		datamodel.setPass(pass);
		datamodel.setPhone(phone);
		datamodel.setAddress(address);
		datamodel.setCity(city);
		datamodel.setCountry(country);
		// Input stream of the upload file
        InputStream inputStream = null;
        Part filePart= request.getPart("photo");
        if (filePart != null) {
        	  
            // Prints out some information
            // for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
  
            // Obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
		try {
			DataEntry.registeruser(datamodel, inputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("login.html");
	}

}
