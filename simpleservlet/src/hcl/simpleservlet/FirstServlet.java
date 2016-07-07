package hcl.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		String n=request.getParameter("userName");
		String p=request.getParameter("userPass");
		
		if(p.equals("tipu"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/servlet2");
			rd.forward(request,response);
		}
		
		else{
			pw.print("Incorect Password for "+n);
			RequestDispatcher rd=request.getRequestDispatcher("/simpleform.html");
			rd.include(request,response);
		}
		
	}

}
