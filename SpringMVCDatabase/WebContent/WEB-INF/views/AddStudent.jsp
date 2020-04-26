<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="hello" method="get">
	<h1>Student Details!!</h1>
		<table>
			<tr>
				<td>Student ID</td><td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>Student Name</td><td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Email</td><td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Marks</td><td><input type="text" name="marks"></td>
			</tr>
			<tr>
				<td><input type="submit" value="AddData"></td>
			</tr>
		</table>
	</form>
	<table border="1">
	<tr><th>StudentID</th><th>Name</th><th>Email</th><th>Marks</th></tr>
		<c:forEach var="stu" items="${students}">
			<tr>
				<td>${stu.sid}</td><td>${stu.name}</td><td>${stu.email}</td><td>${stu.marks}</td>
				<td><a href="removeStudent?sid=${stu.sid}">Delete</a></td>
				<td><a href="updateStudent?sid=${stu.sid}">Update</a></td>
				
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>