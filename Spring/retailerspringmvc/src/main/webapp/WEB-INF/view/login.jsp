<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg}</h3>
	<fieldset>
	<legend>Login</legend>
	<form action="./login" style="margin-left: 525px; margin-top: 20px;" method="post">
		<table>
			<tr>
			<td>Id:</td>
			<td><input type="number" name="id"></td>
			</tr>
			<tr>
			<td>Password:</td>
			<td><input type="password" name="password"></td>
			</tr>
			<tr>
			<td><input type="reset" value="Reset"></td>
			<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</fieldset>
<a href="./register">Click here to Register</a>
</body>
</html>