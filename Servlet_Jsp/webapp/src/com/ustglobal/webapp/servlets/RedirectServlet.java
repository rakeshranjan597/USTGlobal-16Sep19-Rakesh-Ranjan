package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String srch = req.getParameter("search");
		String radio = req.getParameter("select");
		
		if (radio == null) {
			resp.sendRedirect("https://www.facebook.com");			
		}
		
		if(radio.equals("Bing")) {
			resp.sendRedirect("https://www.bing.com/search?q="+srch);
		} else if (radio.equals("Google")) {
			resp.sendRedirect("https://www.google.com/search?q="+srch);
		} else if (radio.equals("Yahoo")) {
			resp.sendRedirect("https://in.search.yahoo.com/search?p="+srch);
		}
		
	}
}
