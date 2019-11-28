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


@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		PrintWriter out = resp.getWriter();
		
		resp.setContentType("text/html");
		out.println("<script type='text/javascript'>");
		out.println("alert('Successfully Logged Out!!!');");
		out.println("</script>");
		session.removeAttribute("info");
		session.invalidate();
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.include(req, resp);
	} 
}
