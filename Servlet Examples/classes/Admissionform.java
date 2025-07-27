import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/admission")

public class Admissionform extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Student Admission Form</title></head>");
        out.println("<body>");
        out.println("<h2>Admission Form</h2>");
        out.println("<form method = \"get\" >");

        out.println("<label>Full Name:</label><br>");
        out.println("<input type='text' name='name'><br><br>");

        out.println("<label>Gender:</label><br>");
        out.println("<input type='radio' name='gender' value='Male'> Male<br>");
        out.println("<input type='radio' name='gender' value='Female'> Female<br><br>");

        out.println("<label>Date of Birth:</label><br>");
        out.println("<input type='date' name='dob' value = 'dob'><br><br>");

        out.println("<label>Course:</label><br>");
        out.println("<select name='course'>");
        out.println("<option value='B.Sc'>B.Sc</option>");
        out.println("<option value='B.Com'>B.Com</option>");
        out.println("<option value='B.A'>B.A</option>");
        out.println("<option value='BCA'>BCA</option>");
        out.println("</select><br><br>");

        out.println("<input type='submit' value='Submit'>");
            
            String name = request.getParameter("name");
            String gender = request.getParameter("gender");
            String dob = request.getParameter("dob");
            String course = request.getParameter("course");
        
            if(name !=null && gender !=null && dob != null && course !=null){
            
            out.println("<p> Name : " +name+ "</p>");
            out.println("<p> GENDER : " +gender+ "</p>");
            out.println("<p> DATE OF BIRTH : " +dob+ "</p>");
            out.println("<p> COURSE : " +course+ "</p>");

        }

        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
