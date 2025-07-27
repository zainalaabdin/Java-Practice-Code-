import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/marksheet")
public class Marksheet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
            String engStr = request.getParameter("eng");
            String urduStr = request.getParameter("urdu");
            String scienceStr = request.getParameter("sci");
            String mathStr = request.getParameter("math");
            String computerStr = request.getParameter("com");
                
            String eng = "";
            String urdu = "";
            String sci = "";
            String math = "";
            String com = "";
            String totalStr = "";
            String grade = "";

            double percentage = 0;
        

        if (engStr != null && urduStr != null && scienceStr != null && mathStr!= null && computerStr != null) {
            
            int e = Integer.parseInt(engStr);
            int u = Integer.parseInt(urduStr);
            int s = Integer.parseInt(scienceStr);
            int m = Integer.parseInt(mathStr);
            int c = Integer.parseInt(computerStr);

            eng = engStr;
            urdu = urduStr;
            sci = scienceStr;
            math = mathStr;
            com = computerStr;
            
            int total = e + u + s + m + c;
            totalStr = String.valueOf(e + u + s + m + c);
            percentage = ((double) total / 500) * 100;
            
            if (percentage >= 80)
                grade = "A+";
                else if (percentage >= 70)
                grade = "A";
                else if (percentage >= 60) 
                grade = "B";
                else if (percentage >= 50) 
                grade = "C";
                else grade = "Fail";
        }

       
        out.println("<html>");
        out.println("<head><title>Marksheet</title></head>");
        out.println("<body>");
        out.println("<h2>Student Marksheet</h2>");
        out.println("<form method='get'>");
       
        out.println("English Marks: <input name='eng' type='number' value='" + eng + "'/><br><br>");
        out.println("Urdu Marks: <input name='urdu' type='number' value='" + urdu + "'/><br><br>");
        out.println("Science Marks: <input name='sci' type='number' value='" + sci + "'/><br><br>");
        out.println("Math Marks: <input name='math' type='number' value='" + math + "'/><br><br>");
        out.println("Computer Marks: <input name='com' type='number' value='" + com + "'/><br><br>");
        
        out.println("<input type='submit' value='Generate Marksheet'/><br><br>");

        out.println("Total Marks: <input type='text' value='" + totalStr + "' readonly/><br><br>");
        out.println("Percentage: <input type='text' value='" + percentage + "%' readonly/><br><br>");
        out.println("Grade: <input type='text' value='" + grade + "' readonly/><br><br>");

        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
		
	}
}