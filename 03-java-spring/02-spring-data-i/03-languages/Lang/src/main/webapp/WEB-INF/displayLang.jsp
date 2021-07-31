<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display language</title>
</head>
<body>

<table>
<thead>
<tr>

<td>Language</td>
<td>Master-mind</td>
<td>Current version</td>

</thead>

<tbody>


<tr>
<td><c:out value="${thisLang.codeLang}"></c:out></td>
<td><c:out value="${thisLang.creator}"></c:out></td>
<td><c:out value="${thisLang.currentVersion}"></c:out></td>
<td>







</td>
</tr>
</tbody>
</table>



</body>
</html>