<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Info Page</title>
</head>
<body>

<p>Hello This is where you can edit/update info</p>

<form:form  action="/${Lang.id}/edit" method="POST"  modelAttribute="Lang">
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
<input type="hidden" name="_method" value="PUT" >
<button>Submit</button>

</form:form>
</body>
</html>