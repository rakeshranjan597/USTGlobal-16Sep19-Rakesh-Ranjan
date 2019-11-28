package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	
	
	@Override
	public void init() throws ServletException{
		System.out.println("init method");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Service method");
		System.out.println("extra line of code");
		
		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company-name");
		
		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch-name");
	
		
		String empName = req.getParameter("empname");
		String empEmail = req.getParameter("empemail");
		String empPass = req.getParameter("emppass");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h2>");
		out.println(empName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(empEmail);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(empPass);
		out.println("</h2>");
		
		out.println("</h2>");
		out.println(companyName);
		out.println("</h2>");
		
		out.println("</h2>");
		out.println(batchName);
		out.println("</h2>");

		
		out.println("</body>");
		out.println("</html>");
		
		
	}
}
