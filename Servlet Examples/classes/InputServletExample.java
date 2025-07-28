import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/input1")

public class InputServletExample extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Servlet</title></head>");
        out.println("<body>");
        out.println("<form method='get' action = 'input2'> ");
        out.println("Enter a number: <input type='number' name='num1'><br><br>");
        out.println("Enter a number: <input type='number' name='num2'><br><br>");
        out.println("<select name='operation'>");
        out.println("<option value='add'>Addition (+)</option>");
        out.println("<option value='sub'>Subtraction (-)</option>");
        out.println("<option value='mul'>Multiplication (*)</option>");
        out.println("<option value='div'>Division (/)</option>");
        out.println("</select><br><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");

         }

}