package org.wso2.appfactory.test;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    	throws ServletException, IOException {
		String name = req.getParameter("name");
		req.setAttribute("name", name);
		req.getRequestDispatcher("/Greetings.jsp").forward(req, resp);
	}
}