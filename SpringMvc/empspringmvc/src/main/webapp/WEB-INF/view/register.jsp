<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset align="center" style="width: 400px; margin-left:350px; margin-top:100px">
	<legend> Register </legend>
		<form action="./register" method="post">
			Name:<input type="text" name="name" /> <br> <br>
			Email:<input type="text" name="email" /> <br> <br>
			Password:<input type="password" name="password" /> <br> <br>
			DOJ:<input type="date" name="doj" /> <br> <br>
			Gender:
			<select name="gender" required="required">
				<option>----Select----</option>
				<option value="F">Female</option> 
				<option value="M">Male</option> 
			</select>	<br> <br>
			<input type="reset" value="Reset" />
			<input type="submit" value="Register" />
		</form>
	<br>
	 <a href="./login" > Click For Login </a>
	</fieldset>

</body>
</html>