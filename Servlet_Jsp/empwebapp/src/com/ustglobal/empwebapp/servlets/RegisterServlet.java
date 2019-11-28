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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	
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
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		EmployeeInfo info = new EmployeeInfo();
		info.setId(id);
		info.setName(name);
		info.setEmail(email);
		info.setPassword(password);
		
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		boolean check = dao.registrationEmployee(info);
		
		if(check) {
			out.println("<h3 align='center' style='color:blue'> Registration Successfully Completed!!! </h3>");
			
		} else {
			out.println("<h3 align='center' style='color:red'> Id cannot be accepted!!! </h3>");
		}
		
		RequestDispatcher rs = req.getRequestDispatcher("login.html");
		rs.include(req, resp);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
