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
<h1>${qus.ques}</h1>

<ul>
<c:forEach items="${qus.tagForQus }" var="tg">
<li>${tg.tag}</li>
</c:forEach>

</ul>
<hr>

<ul>
<c:forEach items="${qus.answers }" var="an">
<li>${an.answers} 
</c:forEach>

</ul>
<hr>
<form:form method="POST" action="/show/${answers.id}" modelAttribute="answers">
<p>
<form:label path="answ">Answer</form:label>
<form:errors path="answ"></form:errors>
<form:textarea path="answ"/>
</p>
<button>Submit</button>
</form:form>




</body>
</html>