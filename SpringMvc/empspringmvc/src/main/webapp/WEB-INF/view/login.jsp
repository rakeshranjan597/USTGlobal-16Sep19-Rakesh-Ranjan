<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page session="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 style='color: red; align: center'> ${msg} </h3>
	<fieldset align='center' style='width: 400px; margin-left: 350px; margin-top: 100px'>
		<legend> Login </legend>
		<form action='./login' method='post'>
			Id:<input type='number' name='id' /> <br> <br>
			Password:<input type='password' name='password' /> <br> <br>
			<input type='submit' value='Login' />
			<input type='reset' value='Reset'>
		</form>
		<br> 
		<a href='./register'> Click For Register</a>
	</fieldset>
	
</body>
</html>