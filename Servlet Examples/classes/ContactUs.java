import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContactUs extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Contact Us</title></head>");
        out.println("<body>");
        out.println("<h2>Contact Us</h2>");

        out.println("<form method = 'get'>");

        out.println("<label>Full Name:</label><br>");
        out.println("<input type='text' name='name'><br><br>");

        out.println("<label>Email:</label><br>");
        out.println("<input type='email' name='email'><br><br>");

        out.println("<label>Subject:</label><br>");
        out.println("<input type='text' name='subject'><br><br>");

        out.println("<label>Message:</label><br>");
        out.println("<textarea name='message' rows='5' cols='30'></textarea><br><br>");

        out.println("<input type='submit' value='Submit'>");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        if(name !=null && email !=null && subject !=null && message !=null ){
            out.println("<p> Name : "+name+"</p>");
            out.println("<p> Email : "+email+"</p>");
            out.println("<p> Subject :"+subject+"</p>");
            out.println("<p> Message : "+message+"</p>");
        }

        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }
}