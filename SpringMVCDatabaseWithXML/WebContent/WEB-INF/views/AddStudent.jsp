<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		.err{
			color: red;
			font-family: fantasy;
		}
	</style>
</head>
<body>
	<f:form action="hello" method="get" modelAttribute="student">
	<h1>Student Details!!</h1>
		<table>
			<tr>
				<td>Student ID</td><td><f:input path="sid"/></td>
				<td><f:errors path="sid" cssClass="err"/></td>
			</tr>
			<tr>
				<td>Student Name</td><td><f:input path="name"/></td>
				<td><f:errors path="name" cssClass="err"/></td>
			</tr>
			<tr>
				<td>Email</td><td><f:input path="email"/></td>
				<td><f:errors path="email" cssClass="err"/></td>
			</tr>
			<tr>
				<td>Marks</td><td><f:input path="marks"/></td>
				<td><f:errors path="marks" cssClass="err"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="AddData"></td>
			</tr>
		</table>
	</f:form>
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