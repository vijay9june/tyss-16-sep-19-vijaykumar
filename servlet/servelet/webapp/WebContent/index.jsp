<%!
	public void jspInit() {
		System.out.println("this is init phase");
	}
%>
<%!
	public void jspDestroy() {
		System.out.println("this is jspDestroy phase");
	}
%>
<!DOCTYPE html>
<%@page import="java.util.Date"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	Date date = new Date();
%>

<body>
	<h1 style="color:green;">Date and Time is <%=date%></h1>
</body>

</html>