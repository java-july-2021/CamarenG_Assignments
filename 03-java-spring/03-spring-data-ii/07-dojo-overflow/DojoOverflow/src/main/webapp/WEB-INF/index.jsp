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

<table>
<thead>
<tr>
<th>Question</th>
<th>Tags</th>
</tr>
</thead>
<tbody>
<c:forEach items="${allQus}" var="ques">
<tr>
<td><a href="/show/${ques.id}">${ques.ques}</a></td>
<td>
<p>
<c:forEach items="${ques.tagForQus}" var="text">
${text.tag }
</c:forEach>
</p>
</td>
</tr>
</c:forEach>


</tbody>

</table>

<p><a href="/newQuest">New Question!</a></p>

</body>
</html>