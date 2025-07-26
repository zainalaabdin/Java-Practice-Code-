import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Table extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String number = request.getParameter("name");
        if (number == null) {
            number = "";
        }

        out.println("<html>");
        out.println("<body>");
        out.println("<form method='get'>");
        out.println("Enter Any Number  : <input name='name' value='" + number + "' />");
        out.println("<input type='submit' value='Submit' /><br><br>");
        out.println("</form>");
        
        if (number != null && !number.isEmpty()) {
            int num = Integer.parseInt(number);
           

            for (int i = 1; i <= num; i++) {
                out.println("<strong>Table of " + i + "</strong><br>");
                for (int j = 1; j <= 10; j++) {
                    out.println(i + " x " + j + " = " + (i * j) + "<br>");
                }
                out.println("<br>");
            }
        }

        out.println("</body>");
        out.println("</html>");
    }
}
