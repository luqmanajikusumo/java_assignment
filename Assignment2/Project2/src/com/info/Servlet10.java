package com.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DataProfile;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet10
 */
public class Servlet10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		String uname = request.getParameter("uname");
		
		DataModel datamodel = new DataModel();
		datamodel.setName(name);
		datamodel.setEmail(email);
		datamodel.setAddress(address);
		datamodel.setPhone(phone);
		datamodel.setCity(city);
		datamodel.setCountry(country);
		datamodel.setUname(uname);
		
		try {
			DataProfile.userprofile(datamodel,uname);
		}catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("datamodel", datamodel);
		request.getRequestDispatcher("userprofile.jsp").include(request, response);
	}

}
