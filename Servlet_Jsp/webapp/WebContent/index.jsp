<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="index.html" %>	<!-- Only file can pass -->
<%-- <%@ taglib uri="" prefix="" %> --%>
	<!-- uri=utl+urn -->
<%-- <%@ page extends="javax.servlet.http.HttpServlet" %> --%>
<%-- <%@ page session="false" %>    Session obj will not load --%>

<!-- multithread will disable, only single thread is active.. and execute one by one -->
<%-- <%@ page isThreadSafe="false" %>	 --%>
	<!-- depricated -->
	
<%-- <%@ page errorPage="error.jsp" %> --%>
	
<%-- <%@ page isErrorPage="true" %> --%>

<%!
	public void jspInit(){
		System.out.println("this is init phase");
	}
	public void jspDestroy(){
		System.out.println("this is destroy phase");
	}
%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
 	
	<% 
		Date date = new Date(); m(); 
//		int i = 1/0;
	%> <br>
	<%! 
		public int i = 10;
		public void m(){
			System.out.println(i);
		}
	%>
	
<body>

	<h1> This is Heading </h1>
	<h3> The current date and time is :<%=date %></h3>
	<h2> <%=i %></h2>
</body>
</html>