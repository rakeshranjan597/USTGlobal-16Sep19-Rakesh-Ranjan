package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie cookies[] = req.getCookies();
		if (cookies!=null) {
			for(Cookie cookie: cookies) {
				if (cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}		

		out.println("<html>");
		out.println("<fieldset align='center' style='width: 400px; margin-left:350px; margin-top:100px'>");
		out.println("<legend> Login </legend>");
		out.println("<form action='login' method='post'>");
		out.println("Id:<input type='number' name='id' value='"+id+"' required /> <br> <br>");
		out.println("Password:<input type='password' name='password' required /> <br> <br>");
		out.println("<input type='checkbox' name='rememberme' value='checked'> Remember Me!! <br> <br>");
		out.println("<input type='submit' value='Login' />");
		out.println("<input type='reset' value='Reset'>");
		out.println("</form>");
		out.println("<br>");
		out.println("<a href='register.jsp' > Click For Register </a>");
		out.println("</fieldset>");
		out.println("</html>");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
