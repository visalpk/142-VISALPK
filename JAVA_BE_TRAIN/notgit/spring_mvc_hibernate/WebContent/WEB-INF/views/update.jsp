<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	
	<form action="/spring_mvc_hibernate/update"  >
	   <table><tr>
	    <td> Id :<input type="text" name="Id" value="${Id}" readonly></td>
		<td> User Name :<input type="text" name="${userName}"></td>
		<td> User Age : <input type="text" name="${userAge}"></td></tr>
		</table>
		
		 <input type="hidden" id="id" name="id" value="Id"/>
		 <input
			type="submit" value="add">
	</form>
</body>
</html>