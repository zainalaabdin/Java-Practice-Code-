package log;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/welcome")
public class WelcomeServletCookie extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = null;

        // Read cookies
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    username = c.getValue();
                    break;
                }
            }
        }

        response.setContentType("text/html");
        if (username != null) {
            response.getWriter().println("Welcome back, " + username + "!");
        } else {
            response.getWriter().println("No user found. Please <a href='CookieLogin.html'>login again</a>.");
        }
    }
}