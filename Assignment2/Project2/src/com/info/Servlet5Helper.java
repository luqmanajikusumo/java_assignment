package com.info;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DataComplement3;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet5Helper
 */
public class Servlet5Helper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		System.out.println(id);
		String comment = request.getParameter("comment");
		String name = request.getParameter("name");
		System.out.println(name);
		DataModel datamodel = new DataModel();
		datamodel.setComment(comment);
		datamodel.setId(id);
		datamodel.setName(name);
		// Input stream of the upload file
		try {
			DataComplement3.datacomplement(datamodel,id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("datamodel", datamodel);
		request.getRequestDispatcher("editrecord.jsp").include(request, response);
	}

}
