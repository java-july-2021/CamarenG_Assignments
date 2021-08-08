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

<p> Hello Please click <a href="/createDojo">Here </a>to make a new Dojo </p>
<hr>
<p>Please click <a href="/addStudent">Here </a>to add students to a Dojo</p>
<hr>
<p>Please Select a Dojo to view the students</p>
<table>
<thead>
<tr>

<td>Dojo Name</td>

</tr>
</thead>
<tbody>
<c:forEach items="${allDojo}" var="dojos">
<tr>
<td><a href="/${dojos.id}">${dojos.dojoName}</a></td>


</c:forEach>
</tbody>

</table>




</body>
</html>