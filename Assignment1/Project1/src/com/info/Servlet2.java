package com.info;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.DataEdit;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet2
 */
@MultipartConfig(maxFileSize = 16177215)
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		System.out.println(id);
		String name = request.getParameter("cname");
		System.out.println(name);
		String email = request.getParameter("cemail");
		System.out.println(email);
		String address = request.getParameter("caddress");
		System.out.println(address);
		String phone = request.getParameter("cphone");
		System.out.println(phone);
		String city = request.getParameter("ccity");
		System.out.println(city);
		String country = request.getParameter("ccountry");
		System.out.println(country);
		String edu = request.getParameter("cedu");
		System.out.println(edu);
		DataModel datamodel = new DataModel();
		datamodel.setId(id);
		datamodel.setName(name);
		datamodel.setEmail(email);
		datamodel.setAddress(address);
		datamodel.setPhone(phone);
		datamodel.setCity(city);
		datamodel.setCountry(country);
		datamodel.setEducation(edu);
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
			DataEdit.edituser(datamodel,inputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("viewrecord.jsp");
	}

}
