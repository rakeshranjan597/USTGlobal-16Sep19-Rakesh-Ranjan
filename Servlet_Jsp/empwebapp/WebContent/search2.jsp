<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="request" /> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%
	EmployeeInfo info = (EmployeeInfo)request.getAttribute("info");
%>


<body>
	<fieldset align='center' style='width: 500px; margin-left: 200px; margin-top: 50px'>
		<legend> Data of Id: <%= info.getId() %></legend>
		<table align='center' border='2px'>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Password</th>
			</tr>
			<tr>
				<td><%=info.getId() %></td>
				<td><%=info.getName() %></td>
				<td><%= info.getEmail() %></td>
				<td><%= info.getPassword() %></td>
			</tr>
		</table>
	</fieldset>

	<a href='home' style='align: center'> Go to Home Page </a>
</body>
</html>