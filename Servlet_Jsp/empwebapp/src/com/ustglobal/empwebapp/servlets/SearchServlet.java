package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;


@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		resp.setContentType("text/html");
		
		HttpSession session = req.getSession(false);

		PrintWriter out = resp.getWriter();
		if (session == null) {
			out.println("<h2 align='center' style='color:red'> Please Login First!!! </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}		
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info = dao.searchEmployee(id);
		
		
		if(info == null) {
			
			out.println("<h3 align='center' style='color:red'> Data Not Available!!! </h3>");
			RequestDispatcher rd2 = req.getRequestDispatcher("search.jsp");
			rd2.include(req, resp);
			
		}
		else {
			req.setAttribute("info", info);
			RequestDispatcher rd = req.getRequestDispatcher("search2.jsp");
			rd.forward(req, resp);
//			
//			out.println("<fieldset align='center' style='width:500px; margin-left:200px; margin-top:50px'>");
//			out.println("<legend> Data of Id: "+info.getId()+ "</legend>");
//			out.println("<table align='center' border='2px'>");
//			out.println("<tr>");
//			out.println("<th> Id </th>");
//			out.println("<th> Name </th>");
//			out.println("<th> Email </th>");
//			out.println("<th> Password </th>");
//			out.println("</tr>");
//			out.println("<tr>");
//			out.println("<td>" + info.getId() + "</td>");
//			out.println("<td>" + info.getName() + "</td>");
//			out.println("<td>" + info.getEmail() + "</td>");
//			out.println("<td>" + info.getPassword() + "</td>");			
//			out.println("</tr>");
//			out.println("</table>");
//			out.println("</fieldset>");
//			
//			out.println("<a href='home' style='align:center'> Go to Home Page </a>");
//			
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
