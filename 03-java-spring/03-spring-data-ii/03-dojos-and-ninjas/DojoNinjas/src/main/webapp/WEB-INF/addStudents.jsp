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
<p> Hello</p>

<form:form method="POST" action="/newStudent"  modelAttribute="Ninja">

<p>


<form:select path="dojo">
<c:forEach items="${allDojos}" var="dojos">
<option value="${dojos.id}">${dojos.dojoName}</option>
</c:forEach>
</form:select>
</p>
<hr>
<form:label path="firstName">First Name</form:label>
<form:errors path="firstName"></form:errors>
<form:input path="firstName"></form:input>
<hr>
<form:label path="lastName">Last Name</form:label>
<form:errors path="lastName"></form:errors>
<form:input path="lastName"></form:input>
<hr>
<form:label path="age">Age</form:label>
<form:errors path="age"></form:errors>
<form:input path="age"></form:input>
<hr>
<button>Submit</button>
</form:form>
</body>
</html>