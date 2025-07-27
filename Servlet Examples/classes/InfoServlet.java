
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class InfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = getServletContext();

        String appName = context.getInitParameter("appName");
        String adminEmail = context.getInitParameter("adminEmail");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + appName + "</h1>");
        out.println("<p>Contact admin: " + adminEmail + "</p>");
    }
}
