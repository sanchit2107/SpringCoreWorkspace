<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="search">
		StudentID<input type="text" name="t1"></br>
		<input type="submit" value="Search">
	</form>
	<table border="1">
		<tr><th>StudentID</th><th>Name</th><th>Subject</th><th>Marks</th></tr>
		<tr><td>${student.sid}</td><td>${student.name}</td><td>${student.subject}</td><td>${student.marks}</td></tr>
	</table>
</body>
</html>