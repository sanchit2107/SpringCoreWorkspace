<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update" method="get">
	<h1>Student Details!!</h1>
		<table>
			<tr>
				<td>Student ID</td><td><input type="text" name="sid" value="${student.sid}" contenteditable="false"></td>
			</tr>
			<tr>
				<td>Student Name</td><td><input type="text" name="name" value="${student.name}"></td>
			</tr>
			<tr>
				<td>Email</td><td><input type="text" name="email" value="${student.email}"></td>
			</tr>
			<tr>
				<td>Marks</td><td><input type="text" name="marks" value="${student.marks}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="UpdateData"></td>
			</tr>
		</table>
	</form>
</body>
</html>