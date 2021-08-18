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

<form:form method="POST" action="/newQuest" modelAttribute="qus">

<p>
<form:label path="ques">Question</form:label>
<form:errors path="ques"></form:errors>
<form:textarea path="ques"/>
</p>
<hr>
<p>
<form:label path="tagsFromPage">Tags</form:label>
<form:errors path="tagsFromPage"></form:errors>
<form:textarea path="tagsFromPage"></form:textarea>
</p>

<button>Submit</button>

</form:form>


</body>
</html>