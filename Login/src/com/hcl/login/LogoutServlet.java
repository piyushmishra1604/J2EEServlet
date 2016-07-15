package com.hcl.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		Cookie ck=new Cookie("name","");
		ck.setMaxAge(0);
		ck.setValue(null);
		response.addCookie(ck);
		
		pw.println("<br><br><br><h2>you are successfully logged out of the page</h2>");
		
		
	}

}
