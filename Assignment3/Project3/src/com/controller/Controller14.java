package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DeleteUser;
import com.model.Model2;

/**
 * Servlet implementation class Controller14
 */
public class Controller14 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		Model2 datamodel = new Model2();
		datamodel.setUname(uname);
		try {
			DeleteUser.deleteuser(datamodel, uname);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("admindash.jsp");
	}

}
