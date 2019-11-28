package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;


@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		int id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		String rememberMe = req.getParameter("rememberme");

		if(rememberMe == null) {
			Cookie[] cookies = req.getCookies();
			if(cookies != null) {
				for(Cookie cookie : cookies) {
					if(cookie.getName().equals("alwaysRemember")) {
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
					}
				}
			}
		} else {
			Cookie cookie = new Cookie("alwaysRemember", id+"");
			resp.addCookie(cookie);
		}

		PrintWriter out = resp.getWriter();

		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info = dao.auth(id, password);

		if(info == null) {
			out.println("<h1 align='center' style='color:red'> Please Enter Correct id and password </h1>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);

		} else {

			HttpSession session = req.getSession(true);
			session.setAttribute("info", info);
		
			RequestDispatcher rd = req.getRequestDispatcher("home");
			rd.forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("home");
			rd.forward(req, resp);
		}
	}
}
