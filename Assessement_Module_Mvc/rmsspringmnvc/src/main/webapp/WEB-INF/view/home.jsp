<%@page import="com.ustglobal.rmsspringmnvc.dto.ProductBean"%>
<%@page import="com.ustglobal.rmsspringmnvc.dto.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	<%
		RetailerBean bean = (RetailerBean)session.getAttribute("bean");
	%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./updatepassword"> Change Password </a> &nbsp; &nbsp;
	<a href="./delete"> Delete Profile </a> &nbsp; &nbsp;
	<a href="./logout" style="float: right;"> Logout </a>
	 
	<center> <h2 style="color: blue;"> Welcome <%= bean.getName() %></h2> </center>

 	
 	<fieldset align="center" style="width: 500px; margin-left:350px; margin-top:100px">
	<legend> Search </legend>
	<form action="./search">
	
		<table align="center">
			<tr>
				<td> Search for product By Product Id: &nbsp; </td>
				<td> <input type="number" name="pid" ></td>
			</tr>
			<tr>
				<td> <input type="submit" value="Search"></td>
			</tr>
		</table>
	
	</form>
	</fieldset>
		
	<%
		ProductBean productBean = (ProductBean)request.getAttribute("bean");
	%>
	
	<%
		if(productBean != null){
	%>
	<fieldset align='center' style='width: 500px; margin-left: 350px; margin-top: 50px'>
		<legend> Details of Product Id: <%= productBean.getPid() %></legend>
		<table align='center' border='2px'>
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Buy 1 Item</th>
			</tr>
			<tr>
				<td><%= productBean.getPid() %></td>
				<td><%= productBean.getPname() %></td>
				<td><%= productBean.getPriceperunit() %></td>
				<td><%= productBean.getQuantity() %></td>
				<td>
					<form action="./buy">
						<input type="hidden" name="bid" value="<%= productBean.getPid() %>" />
						<input type="submit" value="Buy" />
					</form>
				</td>
				
				
			</tr>
		</table>
	</fieldset>
	<%
		}
	%>
 
	<center>	<h3>${msg}</h3> </center>
	
</body>
</html>