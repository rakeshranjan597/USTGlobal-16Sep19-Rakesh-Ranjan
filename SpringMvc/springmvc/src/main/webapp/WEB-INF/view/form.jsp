<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<form action="./form" method="post">
			<input type="number" placeholder="Enter the id..." name="id" /> <br> <br>
			<input type="text" placeholder="Enter the name..." name="name" /> <br> <br>
			<input type="password" placeholder="Enter the password..." name="password" /> <br> <br>
			<input type="text" placeholder="Enter the gender..." name="gender" /> <br> <br>
			<input type="date" name="doj" /> <br> <br>
			<input type="reset" value="Reset" />
			<input type="submit" value="Register" />
		</form>
	
</body>
</html>