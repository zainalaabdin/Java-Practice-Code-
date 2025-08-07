package log;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServletCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");

       
        Cookie userCookie = new Cookie("username", username);
        userCookie.setMaxAge(60 * 60); 
        response.addCookie(userCookie);

        response.setContentType("text/html");
        response.getWriter().println("Login successful. <a href='welcome'>Go to Welcome Page</a>");
    }
}
