<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
color:gray;
font-weight: bold;
}
td {
	color: white;
}

label {
	margin-left: 100px;
	margin-top: 400px;
}
</style>
</head>
<body>
	<h1 style="color: Gray; text-align: center">Hibernate CRUD App</h1>
	<div class="box">
		<h2 style="color: gray; text-align: center">Registration Form</h2>
		<br />
		<form method="post" action="./search">
			<table align="center" cellpadding="10px">
				<tr>
					<th>Id</th>
					<td><input type="text" name="id" <c:choose><c:when test="${personById ne null }">value="${personById.id }"</c:when> </c:choose> ></td>
					<td align="center"><input type="submit" value="Search"></td>
				</tr>
				<tr>
					<td align="right"><a href="menu.jsp"
						style="color: white; text-align: right;">Back </a></td>
				</tr>
			</table>
		</form>
		<br/>
		<c:choose>
			<c:when test="${personById ne null}">
				<table align="center" cellpadding="15px" border="1" bordercolor="gray" style="width: 500px">
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Age</th>
						<th>Address</th>
					</tr>
					<tr>
						<td align="center">${personById.id } </td>
						<td align="center">${personById.name } </td>
						<td align="center">${personById.age } </td>
						<td align="center">${personById.address } </td>
					</tr>
				</table>
			</c:when>
			<c:when test="${result eq 'notfound'}">
				<h2 style="color: red; text-align: center;">*Record Not Found *</h2>
			</c:when>

		</c:choose>

	</div>


</body>
</html>