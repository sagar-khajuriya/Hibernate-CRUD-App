<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.box {
	background-color: black;
	width: 50%;
	height: 500px;
	margin-top: 00px;
	margin-left: 400px;
	padding-top: 50px;
}

th{
	color: white;
}
label{
margin-left: 100px;
margin-top: 400px;
}
</style>
</head>
<body>
	<h1 style="color: Gray; text-align: center">Hibernate CRUD App</h1>
	<div class="box">
		<h2 style="color: gray; text-align: center">Registration Form</h2><br/>
		<form method="post" action="./insert">
			<table align="center" cellpadding="10px">
				<tr>
					<th>Name</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>Age</th>
					<td><input type="text" name="age"></td>
				</tr>
				<tr>
					<th>Address</th>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td align="center"><input type="submit" value="submit"></td>
					<td align="right"><a href="menu.jsp" style="color: white; text-align: right;">Back </a></td>
				</tr>
			</table>
		</form>

	<c:choose>
		<c:when test="${save eq 'success'}">
			<h2 style="color: green;text-align: center;">*Record Inserted Successfully*</h2>
		</c:when>
		<c:when test="${save eq 'fail'}">
			<h2 style="color: red;text-align: center;">*Record Insertion Failed*</h2>
		</c:when>
	
	</c:choose>
		
	</div>

</body>
</html>