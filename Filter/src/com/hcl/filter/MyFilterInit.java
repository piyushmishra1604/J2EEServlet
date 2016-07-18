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
import javax.servlet.annotation.WebInitParam;


@WebFilter(
        urlPatterns = "/HelloServlet",
        initParams = @WebInitParam(name = "construction", value = "no")
        )

public class MyFilterInit implements Filter {

	FilterConfig config;
	
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		PrintWriter pw=response.getWriter();
		
		String s=config.getInitParameter("construction");
		
		if(s.equals("yes"))
		{
			pw.print("this page is under construction");
		}
		
		else
		{
			 long before=System.currentTimeMillis();  
			  
		        chain.doFilter(request,response);  
		          
		        long after=System.currentTimeMillis();  
		        
		        pw.print("<br/>Total response time "+(after-before)+" miliseconds");  
		      
		}
		
	}

	
	public void init(FilterConfig config) throws ServletException {
		this.config=config;
	}

}
