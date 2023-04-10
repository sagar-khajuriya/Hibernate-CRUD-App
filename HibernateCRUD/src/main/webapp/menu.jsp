<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.box{
background-color: black;
width: 50%;
height: 500px;
margin-top: 00px;
margin-left: 400px;
padding-top: 50px;
}

a{
text-decoration: none;
color: gray;
font-weight: bold;
font-size: 20px;
}
.innerdiv{
border:gray 2px solid;
width: 200px;
height: 30px;
text-align: center;
margin-top: 50px;
margin-left: 275px;
}
.innerdiv:hover {
border:gray 2px dotted;
}

</style>
</head>
<body>
<h1 style="color: Gray;text-align: center">Hibernate CRUD App</h1>
	<div class="box">
		<div class="innerdiv">		<a href="insert.jsp">Insert</a>		</div>
		<div class="innerdiv">		<a href="search.jsp">Search</a>		</div>
		<div class="innerdiv">		<a href="edit.jsp">Update</a>		</div>
		<div class="innerdiv">		<a href="delete.jsp">Delete</a>		</div>	
	</div>


</body>
</html>