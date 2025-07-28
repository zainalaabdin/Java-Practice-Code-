import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ans")

public class InputServletExample4 extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            int result = (Integer) request.getAttribute("ans");
            out.println(result);

         }

}