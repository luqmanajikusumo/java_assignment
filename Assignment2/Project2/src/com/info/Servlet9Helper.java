package com.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DataComplement5;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet2Helper
 */
public class Servlet9Helper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
			
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
				
		try {
			DataComplement5.showuser(datamodel,id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("datamodel", datamodel);
		request.getRequestDispatcher("edituser.jsp").include(request, response);
	}
}
