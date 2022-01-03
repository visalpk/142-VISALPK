<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	
	<form action="update" method="get" items="${uList }" var="user">
	    <p>${user.Id} </p>
	    <p> Id :<input type="text" name="Id" value="${user.Id}" readonly><br></p>
		<p> User Name :<input type="text" name="userName"><br>
		<p> User Age : <input type="text" name="userAge"><br>
		
		 <input
			type="submit" value="add">
	</form>
</body>
</html>