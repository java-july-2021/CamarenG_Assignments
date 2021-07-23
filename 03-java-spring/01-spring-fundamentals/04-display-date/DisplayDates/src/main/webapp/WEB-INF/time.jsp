<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style1.css">
<script type="text/javascript" src="/js/alert1.js"></script>
<meta charset="ISO-8859-1">
<title>Time Page</title>
</head>
<body>
<p>Hello the time is <c:out value = "${currentTime}"/></p> 
</body>
</html>