import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/quiz")
public class Quizform extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String q1 = request.getParameter("q1");
        String q2 = request.getParameter("q2");

        out.println("<html>");
        out.println("<head><title>Simple Quiz</title></head>");
        out.println("<body>");
        out.println("<h2>Simple Quiz</h2>");
        out.println("<form method='get'>");

        out.println("1. What is the capital of France?<br>");
        out.println("<input type='radio' name='q1' value='Paris'> Paris<br>");
        out.println("<input type='radio' name='q1' value='London'> London<br>");
        out.println("<input type='radio' name='q1' value='Berlin'> Berlin<br><br>");

        out.println("2. Java is ___?<br>");
        out.println("<input type='radio' name='q2' value='Language'> Language<br>");
        out.println("<input type='radio' name='q2' value='OS'> OS<br>");
        out.println("<input type='radio' name='q2' value='Game'> Game<br><br>");

        out.println("<input type='submit' value='Submit Quiz'>");
        
        if(q1 != null && q2 != null){
            out.println("<h2>YOUR ANSWER</h2>");
            out.println("Answer 1 :" + q1 + "<br>");
            out.println("Answer 2 :" + q2 + "<br>");
        }
        
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
