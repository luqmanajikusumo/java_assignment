package com.info;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.UserEdit;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet9
 */
public class Servlet9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		System.out.println(id);
		String name = request.getParameter("name");
		System.out.println(name);
		String email = request.getParameter("email");
		System.out.println(email);
		String uname = request.getParameter("uname");
		System.out.println(uname);
		String pass = request.getParameter("pass");
		System.out.println(pass);
		String address = request.getParameter("address");
		System.out.println(address);
		String phone = request.getParameter("phone");
		System.out.println(phone);
		String city = request.getParameter("city");
		System.out.println(city);
		String country = request.getParameter("country");
		System.out.println(country);
		DataModel datamodel = new DataModel();
		datamodel.setId(id);
		datamodel.setName(name);
		datamodel.setEmail(email);
		datamodel.setUname(uname);
		datamodel.setPass(pass);
		datamodel.setAddress(address);
		datamodel.setPhone(phone);
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
			UserEdit.edituser(datamodel,inputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("viewrecord.jsp");
	}

}
