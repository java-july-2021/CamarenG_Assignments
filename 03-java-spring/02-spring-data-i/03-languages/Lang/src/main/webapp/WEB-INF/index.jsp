<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages home</title>
</head>
<body>

<table>
<thead>
<tr>

<td>Language</td>
<td>Master-mind</td>
<td>Current version</td>
<td>Actions</td>

</thead>

<tbody>

<c:forEach items="${allLang}" var="langs">
<tr>
<td><a href="/show/${langs.id}">${langs.codeLang}</a></td>
<td>${langs.creator}</td>
<td>${langs.currentVersion}</td>
<td>


<a href ="/${langs.id}/edit"><button>EDIT</button></a>


<form method="POST" action="/delete/${langs.id}">
<input type="hidden" name="_method" value="DELETE">
<button>Remove</button>
</form>
</td>
</tr>
</c:forEach>
</tbody>
</table>


<p>Add Languages!</p>
<br>
<form:form action="/" method="POST" modelAttribute="Lang">
<br>
<form:label path="creator">Master-Mind</form:label>
<form:errors path="creator"></form:errors>
<form:input path="creator"></form:input>
<hr>
<form:label path="codeLang">Language</form:label>
<form:errors path="codeLang"></form:errors>
<form:input path="codeLang"></form:input>
<hr>
<form:label path="currentVersion">Version</form:label>
<form:errors path="currentVersion"></form:errors>
<form:input path="currentVersion"></form:input>
<hr>
<button>Submit</button>


</form:form>
</body>
</html>