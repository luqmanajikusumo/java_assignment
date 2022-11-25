package com.info;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.DataInsert;
import com.model.DataModel;
/**
 * Servlet implementation class Servlet1
 */

@MultipartConfig(maxFileSize = 16177215)
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("cname");
		String email = request.getParameter("cemail");
		String address = request.getParameter("caddress");
		String phone = request.getParameter("cphone");
		String city = request.getParameter("ccity");
		String country = request.getParameter("ccountry");
		String education = request.getParameter("cedu");
		
		DataModel datamodel = new DataModel();
		datamodel.setName(name);
		datamodel.setEmail(email);
		datamodel.setAddress(address);
		datamodel.setPhone(phone);
		datamodel.setCity(city);
		datamodel.setCountry(country);
		datamodel.setEducation(education);
		// Input stream of the upload file
        InputStream inputStream = null;
        Part filePart= request.getPart("cphoto");
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
			DataInsert.registeruser(datamodel, inputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("index.html");
	}

}
