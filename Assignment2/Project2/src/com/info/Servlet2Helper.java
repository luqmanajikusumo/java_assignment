package com.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DataComplement;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet2Helper
 */
public class Servlet2Helper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		DataModel datamodel = new DataModel();
		datamodel.setName(name);
		datamodel.setUname(uname);
		datamodel.setPass(pass);
				
		try {
			DataComplement.datacomplement(datamodel,uname);
		}catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("datamodel", datamodel);
		request.getRequestDispatcher("userdash.jsp").include(request, response);
	}
}
