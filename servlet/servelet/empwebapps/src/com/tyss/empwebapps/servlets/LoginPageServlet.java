package com.tyss.empwebapps.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
		out.println("<html>");
		out.println("<form action='./login' method='post'>");
		out.println("Id:<input name='id' type='number' value='"+id+"'><br>");
		out.println("Password:<input name='password' type='text'><br>");
		out.println("<input name = 'rememberme' type='checkbox' value='checked'>Remember Me<br>");
		out.println("<input name='login' type='submit'>");
		out.println("</form>");
		out.println("<a href='./register.html'>Register</a>");
		out.println("</html>");
		
		
	}//end of doGet()
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}//end of doPost()
	
}//end of LoginPageServlet


























