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


<form method="POST" action="/createProd">

<p>
<label for="name">Name of Product</label>
<input type="text" name="name">
</p>
<p>
<label for="description">Description of Product</label>
<input type="text" name="description">
</p><p>
<label for="price">Price of Product</label>
<input type="number" name="price" step="0.01">
</p>
<button>Submit</button>

</form>




</body>
</html>