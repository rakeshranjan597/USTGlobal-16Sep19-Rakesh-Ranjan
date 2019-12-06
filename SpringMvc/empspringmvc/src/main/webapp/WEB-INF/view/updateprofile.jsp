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
	
	<div style="margin:0px 100px">
		<a href="./home"> Home </a> <a href="./logout" style="float:right"> Logout </a>
	</div>
	
	<fieldset align="center" style="width: 400px; margin-left:350px; margin-top:100px">
	<legend> Update Profile </legend>
		<form action="./updateprofile" method="post">
			Name:<input type="text" name="updatename" value="<%=bean.getName() %>" /> <br> <br>
			Email:<input type="text" name="updateemail" value="<%=bean.getEmail() %>" /> <br> <br>
			Password:<input type="password" name="updatepassword" value="<%=bean.getPassword() %>" /> <br> <br>
			DOJ:<input type="date" name="updatedoj" /> <br> <br>
			<input type="reset" value="Reset" />
			<input type="submit" value="Update" />
		</form>
	</fieldset>
	
</body>
</html>