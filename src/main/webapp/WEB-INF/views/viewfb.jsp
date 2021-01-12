<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Feedback</title>
</head>
<body>


<h1 style="color:blue">List of Feedback</h1>

<ul>
	<c:forEach items="${fbs}" var="f">
		<li>${f.feedbackDetails}</li>
		
		<li></li>
	</c:forEach>

</ul>

<a href="submitfeedback">Submit another feedback</a>

</body>
</html>