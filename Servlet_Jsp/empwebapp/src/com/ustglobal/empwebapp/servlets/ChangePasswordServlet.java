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


@WebServlet("/changePassword")
public class ChangePasswordServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		resp.setContentType("text/html");

		HttpSession session = req.getSession(false);
		PrintWriter out = resp.getWriter();
		if (session == null) {
			out.println("<h2 align='center'> Please Login First!!! </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);
		}

		String newpassword = req.getParameter("newpassword");
		String confirmpassword = req.getParameter("confirmpassword");

		EmployeeInfo info = (EmployeeInfo) session.getAttribute("info");
		int id = info.getId();

		if (newpassword.equals(confirmpassword)) {
			EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
			boolean check = dao.changePassword(id, newpassword);
			if(check) {

				out.println("<script type=\"text/javascript\">");
				out.println("alert('Password Successfully Changed!!!');");
			    out.println("</script>");
				RequestDispatcher rd = req.getRequestDispatcher("home");
				rd.include(req, resp);

			} else {
				String msz = "Something went Wrong!!!";
//				out.println("<h2 align='center' style='color:red'> Something went Wrong!!! </h2>");
				req.setAttribute("msz", msz);
				RequestDispatcher rd = req.getRequestDispatcher("change_password.jsp");
				rd.forward(req, resp);
			}

		} else {
			String msz = "Password Must Be Same!!!";
//			out.println("<h2 align='center' style='color:red'> Password Must Be Same!!! </h2>");
			req.setAttribute("msz", msz);
			RequestDispatcher rd = req.getRequestDispatcher("change_password.jsp");
			rd.forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
