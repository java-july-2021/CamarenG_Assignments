<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p><c:out value="${products.name}"/></p>
<p><c:out value="${products.description}"/></p>
<p><c:out value="${products.price}"/></p>



<c:forEach items="${Categories}" var="categories">

<li>${categories.name}</li>

</c:forEach>

<form method="POST" action="/addCatToProd/${products.id}">
<select name="categories">
<c:forEach items="${Categories}" var="categories">
<option value="${categories.id}">${categories.name}</option>
</c:forEach>
</select>
<button>Submit</button>
</form>



</body>
</html>