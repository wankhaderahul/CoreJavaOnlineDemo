<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>

<h2>Alien Details</h2>
<a href="home">Add Alien</a>/  <a href="deleteAllAlien">Delete All</a>

${alien}

<table>
 <tr>
    <th>Id</th>
    <th>Aname</th>
    <th>Tech</th>
    <th>Action</th>
  </tr>
   <c:forEach var="listValue" items="${alienList}">
  <tr>
 
    <td>${listValue.aid}</td>
    <td>${listValue.aname}</td>
    <td>${listValue.tech}</td>
    <td><a href="getAlien?aid=${listValue.aid}">Edit</a>/  <a href="deleteAlien?aid=${listValue.aid}">Delete</a> </td>
 
  </tr>
     </c:forEach>
  
</table>
</body>
</html>