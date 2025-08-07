package log;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboardServlet")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	HttpSession session = request.getSession(false);
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	if (session != null && session.getAttribute("username") != null) {
	    String username = (String) session.getAttribute("username");
	    out.println("<h1>Welcome, " + username + "!</h1>");
	    
	    out.println("<form action='logoutServlet' method='get'>");
        out.println("<input type='submit' value='Logout' />");
        out.println("</form>");
       
        
	} else {
	    response.sendRedirect("login.html?error=Please+login+first");
	}

    }
	}
