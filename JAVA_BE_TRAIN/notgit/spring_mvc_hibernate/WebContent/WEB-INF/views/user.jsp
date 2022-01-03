<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title></title>
</head>
<body>

	<form action="/spring_mvc_hibernate/user" method="POST">

		<p> User Name :<input type="text" name="userName"><br>
		<p> User Age : <input type="text" name="userAge"><br>
		
		 <input
			type="submit" value="add">
	</form>
</body>
</html>