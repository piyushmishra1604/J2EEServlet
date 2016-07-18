package com.hcl.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/AdminServlet")
public class MyFilter implements Filter {

    
	
	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter pw=response.getWriter();
		
		String p=request.getParameter("userPass");
		
		if(p.equals("tipu"))
		{
			chain.doFilter(request,response);
			
			pw.print("Successfully logged in");
		}
		else
		{
			pw.print("Incorrect password");
			request.getRequestDispatcher("index.html").include(request,response);
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
