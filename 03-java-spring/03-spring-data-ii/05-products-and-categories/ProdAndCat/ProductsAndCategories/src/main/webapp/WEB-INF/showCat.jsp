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


<p><c:out value="${category.name}"/></p>



<c:forEach items="${Products}" var="products">

<li>${products.name}</li>

</c:forEach>

<form method="POST" action="/addProdToCat/${category.id}">
<select name="products">
<c:forEach items="${Products}" var="products">
<option value="${products.id}">${products.name}</option>
</c:forEach>
</select>
<button>Submit</button>
</form>



</body>
</html>