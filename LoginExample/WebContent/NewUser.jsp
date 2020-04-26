<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserServlet" method="post">
		<table align="center">
			<tr>
				<td>UserName</td><td><input type="text" name="t1"></td>
			</tr>
			<tr>
				<td>Password</td><td><input type="password" name="t2"></td>
			</tr>
			<tr>
				<td>UserType</td>
				<td>
					<select name="ut">
						<option value="H">HR
						<option value="A">Admin
						<option value="D">Developer
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="AddUser"></td>
			</tr>
		</table>
		<h2>${Res}</h2>
	</form>
</body>
</html>