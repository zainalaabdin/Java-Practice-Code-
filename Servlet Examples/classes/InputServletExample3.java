import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/error")

public class InputServletExample3 extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String message = request.getParameter("message");
            out.println(message);
         }

}