package hcl.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	public class SecondServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
			
			String n=request.getParameter("userName");
			
			pw.println("welcome "+n);

}
	}
