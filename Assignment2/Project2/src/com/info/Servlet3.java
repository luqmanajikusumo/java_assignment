package com.info;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.DataAdd;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet3
 */
@MultipartConfig(maxFileSize = 16177215)
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String comment = request.getParameter("comment");
		DataModel datamodel = new DataModel();
		datamodel.setName(name);
		datamodel.setEmail(email);
		datamodel.setComment(comment);
		// Input stream of the upload file
        InputStream inputStream = null;
        Part filePart= request.getPart("txtfile");
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
			DataAdd.addrecord(datamodel,name,email,inputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("datamodel", datamodel);
		request.getRequestDispatcher("userdash.jsp").include(request, response);
	}

}
