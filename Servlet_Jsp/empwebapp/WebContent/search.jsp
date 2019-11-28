<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
	
		if(session.getAttribute("info") == null){
			response.sendRedirect("login.html");
		}
	%>

<div style="margin:0px 100px">
	<a href="home"> Home</a> <a href="logout" style="float:right"> Logout </a>
</div>
<fieldset align="center" style="width: 400px; margin-left:350px; margin-top:100px">
	<legend> Search </legend>
	<form action="search" method="post">
	
		<table align="center">
			<tr>
				<td> Search By Id: </td>
				<td> <input type="number" name="id" required></td>
			</tr>
			<tr>
				<td> <input type="submit" value="Search"></td>
			</tr>
		</table>
	
	</form>
</fieldset>

</body>
</html>