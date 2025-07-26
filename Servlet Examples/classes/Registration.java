import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Registration extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
            
            String fullname = request.getParameter("fullname");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String city = request.getParameter("city");
            String dob = request.getParameter("dob");
            String phone = request.getParameter("phone");

            out.println("<html>");
            out.println("<body>");
            out.println("<head></head>");
            out.println("<h2>Registration Form</h2>");

            out.println("<form method='get'>");
            out.println("<label>Full Name:</label><br>");
            out.println("<input type='text' name='fullname'><br><br>");
            out.println("<label>Email:</label><br>");
            out.println("<input type='email' name='email'><br><br>");
            out.println("<label>Password:</label><br>");
            out.println("<input type='password' name='password'><br><br>");
            out.println("<label>Gender:</label><br>");
            out.println("<input type='radio' name='gender' value='Male'> Male<br>");
            out.println("<input type='radio' name='gender' value='Female'> Female<br><br>");
            out.println("<label>City:</label><br>");
            out.println("<select name='city'>");
            out.println("<option value=''>--Select City--</option>");
            out.println("<option value='Karachi'>Karachi</option>");
            out.println("<option value='Lahore'>Lahore</option>");
            out.println("<option value='Islamabad'>Islamabad</option>");
            out.println("<option value='Hyderabad'>Hyderabad</option>");
            out.println("</select><br><br>");
            out.println("<label>Date of Birth:</label><br>");
            out.println("<input type='date' name='dob'><br><br>");
            out.println("<label>Phone Number:</label><br>");
            out.println("<input type='text' name='phone'><br><br>");
            out.println("<input type='submit' value='Register'>");
            out.println("</form>");

            if (fullname != null && email != null && password != null && gender != null && city != null && dob != null && phone != null) {
            out.println("<h3>Submitted Information:</h3>");
            out.println("Full Name: " + fullname + "<br>");
            out.println("Email: " + email + "<br>");
            out.println("Password: " + password + "<br>");
            out.println("Gender: " + gender + "<br>");
            out.println("City: " + city + "<br>");
            out.println("Date of Birth: " + dob + "<br>");
            out.println("Phone: " + phone + "<br>");
        }

            out.println("</body>");
            out.println("</html>");

    }
}