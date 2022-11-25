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
 * Servlet implementation class Servlet5
 */
@MultipartConfig(maxFileSize = 16177215)
public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String comment = request.getParameter("comment");
		DataModel datamodel = new DataModel();
		datamodel.setId(id);
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
			DataEdit.editrecord(datamodel,inputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("datamodel", datamodel);
		request.getRequestDispatcher("viewrecord.jsp").include(request, response);
	}
}
