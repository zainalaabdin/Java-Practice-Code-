import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import java.io.*;

@WebServlet(
    urlPatterns = {"/initparam"},
    initParams = {
        @WebInitParam(name = "username", value = "admin"),
        @WebInitParam(name = "password", value = "1234")
    }
)
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
