package com.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DeleteUser;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet11
 */
public class Servlet11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		DataModel datamodel = new DataModel();
		datamodel.setUname(uname);
		try {
			DeleteUser.deleteuser(datamodel, uname);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("admindash.jsp");
	}

}
