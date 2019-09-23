<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style>
.studentLinks {
	background-color: #d3bcf5;
	align: center;
	text-align: center;
	cellspacing: 30;
	cellpadding: 30;
}

a:link, a:visited {
	background-color: #bd99f2;
	color: white;
	padding: 20px 25px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
}

a:hover, a:active {
	background-color: #a56ef5;
}

body {
	background-color: #e4d7f7;
}
</style>
</head>
<body>
<div align="center">
<h2>${message}</h2>
<a href="/StudentDetail">Add Student Detail</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/ShowStudent">Show All Student</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/SearchStudent">Search Student</a>
</div>
</body>
</html>