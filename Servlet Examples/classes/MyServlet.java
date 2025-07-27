import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServletinitParam extends HttpServlet {
    String username;
    String password;

    public void init() throws ServletException {
        ServletConfig config = getServletConfig();
        username = config.getInitParameter("username");
        password = config.getInitParameter("password");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Username: " + username + "<br>");
        out.println("Password: " + password);
    }
}
