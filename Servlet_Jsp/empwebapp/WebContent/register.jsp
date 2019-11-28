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
	
	%>

<fieldset align="center" style="width: 400px; margin-left:350px; margin-top:100px">
	<legend> Register </legend>
		<form action="register" method="post">
			Id:<input type="number" name="id" required /> <br> <br>
			Name:<input type="text" name="name" required /> <br> <br>
			Email:<input type="text" name="email" required /> <br> <br>
			Password:<input type="password" name="password" required /> <br> <br>
			<input type="submit" value="Register" />
		</form>
	<br>
	 <a href="login.html" > Click For Login </a>
</fieldset>

</body>
</html>