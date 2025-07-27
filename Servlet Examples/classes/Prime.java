import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/prime")
public class Prime extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Prime Number Checker</title></head>");
        out.println("<body>");
        out.println("<h2>Check Prime Number</h2>");
        out.println("<form method='get'>");
        out.println("Enter a number: <input type='number' name='num'><br><br>");
        out.println("<input type='submit' value='Check'>");
        out.println("</form>");

        String input = request.getParameter("num");

        if (input != null && !input.equals("")) {
            int num = Integer.parseInt(input);
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                out.println("<h3>" + num + " is a PRIME number.</h3>");
            } else {
                out.println("<h3>" + num + " is NOT a prime number.</h3>");
            }
        }

        out.println("</body>");
        out.println("</html>");
    }
}
