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

<form:form method="POST" action="/addDojo" modelAttribute="Dojo">
<p>
<form:label path="dojoName">Dojo Name</form:label>
<form:errors path="dojoName"></form:errors>
<form:input path="dojoName"></form:input>
</p>
<button>Submit</button>

</form:form>



</body>
</html>