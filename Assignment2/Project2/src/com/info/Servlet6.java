package com.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DeleteRecord;
import com.model.DataModel;

/**
 * Servlet implementation class Servlet6
 */
public class Servlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String id = request.getParameter("id");
			DataModel datamodel = new DataModel();
			datamodel.setId(id);
			try {
				DeleteRecord.deleterecord(datamodel);
			}catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("viewrecord.jsp");
	}

}
