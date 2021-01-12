<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Feedback</title>
</head>
<body>

<form method="post">

Enter Feedback: <input type="text" name="feedback"/>
<br/><button type="submit">Submit</button>
</form>


</body>
</html>