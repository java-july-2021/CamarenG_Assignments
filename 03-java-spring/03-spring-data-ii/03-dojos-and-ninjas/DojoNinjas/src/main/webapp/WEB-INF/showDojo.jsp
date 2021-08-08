<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
<tr>

<td>First Name</td>
<td>Last Name</td>
<td>Age</td>

</tr></thead>
<tbody>
<c:forEach items="${Dojo.ninjas}" var="ninjas"> 
<tr>
<td>${ninjas.firstName}</td>
<td>${ninjas.lastName}</td>
<td>${ninjas.age}</td>



</c:forEach>
</tbody>

</table>


</body>
</html>