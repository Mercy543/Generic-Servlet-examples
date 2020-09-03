import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletExample extends GenericServlet {

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		//media type
		response.setContentType("text/html");
		
		//generate response
		PrintWriter outRes = response.getWriter();
		
		outRes.print("<html>");
		outRes.print("<body>");
		outRes.print("<h5>WELCOME TO YOUR FIRST SERVLET CLASS</h5>");
		outRes.print("<h1>hello Generic Servlet Example</h1>");
		outRes.print("<p>Not a Protocol resticted Request</p>");
		outRes.print("<p>Thank you very Much</p>");
		outRes.print("</body>");
		outRes.print("</html>");
	}
}
