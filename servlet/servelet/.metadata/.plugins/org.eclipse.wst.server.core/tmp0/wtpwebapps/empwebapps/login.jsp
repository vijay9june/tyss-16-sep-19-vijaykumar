<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<% 
String id = "";
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
%>
</head>
<body>

	<form action='./login' method='post'>
		Id:<input name='id' type='number' value='<%=id%>'><br>
		Password:<input name='password' type='text'><br> 
		<input name = 'rememberme' type='checkbox' value='checked'>Remember Me<br>
		<input name='login' type='submit'>
	</form>
	<a href='./register.html'>Register</a>

</body>
</html>