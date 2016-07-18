package com.hcl.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		request.getRequestDispatcher("link.html").include(request, response);
		String n=request.getParameter("userName");
		String p=request.getParameter("userPass");
		
		if(p.equals("tipu"))
		{
			pw.println("<h1>You are successfully logged in</h1>");
			pw.println("Welcome "+n);
			
			HttpSession session=request.getSession();
			session.setAttribute("name",n);
		}
		
		else
		{
			pw.print("Sorry Incorrect password");
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}

}
