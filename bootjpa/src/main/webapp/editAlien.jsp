<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>

<h2>Edit Alien Details</h2>

<form action="updateAlien">

<input type="hidden" name="aid" value="${alien.aid}"><br>
Name:- <input type="text" name="aname" value="${alien.aname}"><br>
Technology:- <input type="text" name="tech" value="${alien.tech}"><br>
<input type="submit" value="Update"><br>
</form>



</body>
</html>