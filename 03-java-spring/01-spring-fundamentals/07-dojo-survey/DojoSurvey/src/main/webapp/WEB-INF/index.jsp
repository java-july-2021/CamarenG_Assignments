<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>

<form method="POST" action="/fillOutForm">

<label for="name">Your Name</label>
<input type="text" name="name">
<label for="location">your location</label>
<select name="location">

	<option value="Burbank">Burbank</option>
	<option value="San Jose">San Jose</option>
	<option value="Online PT"> Online Part Time</option>
	<option value="onlinr FT"> Online Full Time</option>
</select>

<select name="language">

	<option value="HTML">HTML</option>
	<option value="Python">Python</option>
	<option value="JavaScript">JavaScript</option>
	<option value="Java">Java</option>

</select>

<label for="comments">Comments(optional)</label>
<textarea name="comments" placeholder="Any CONSTRUCTIVE comments can go here"></textarea>
<button>Submit</button>

</form>

</body>
</html>