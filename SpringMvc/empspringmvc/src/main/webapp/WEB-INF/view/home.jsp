<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    	EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword"> Change Password </a> &nbsp; &nbsp;
	<a href="./updateprofile"> Update Profile </a> &nbsp; &nbsp;
	<a href="./delete"> Delete Profile </a> &nbsp; &nbsp;
	<a href="./logout" style="float: right;"> Logout </a>
	
	<h2> Welcome <%= bean.getName() %></h2>
	
	<fieldset align="center" style="width: 400px; margin-left:350px; margin-top:100px">
	<legend> Search </legend>
	<form action="./search">
	
		<table align="center">
			<tr>
				<td> Search By Id: </td>
				<td> <input type="number" name="id" ></td>
			</tr>
			<tr>
				<td> <input type="submit" value="Search"></td>
			</tr>
		</table>
	
	</form>
	</fieldset>
	
	<%
		EmployeeBean employeeBean = (EmployeeBean)request.getAttribute("bean");
	%>
	
	<%
		if(employeeBean!=null){
	%>
	<fieldset align='center' style='width: 500px; margin-left: 200px; margin-top: 50px'>
		<legend> Data of Name: <%= employeeBean.getId() %></legend>
		<table align='center' border='2px'>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Gender</th>
				<th>DOJ</th>
			</tr>
			<tr>
				<td><%= employeeBean.getName() %></td>
				<td><%= employeeBean.getEmail() %></td>
				<td><%= employeeBean.getGender() %></td>
				<td><%= employeeBean.getDoj() %></td>
			</tr>
		</table>
	</fieldset>
	<%
		}
	%>

	<h3>${msg}</h3>
	
</body>
</html>