import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class YeartoHour extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
		PrintWriter out = response.getWriter();
       
        String year = request.getParameter("year");
        String hour = "";
        
        String s = """
            <html>  <html>
                """;


        if (year != null) {
            int y = Integer.parseInt(year);
            int h = y * 365 * 24;
            hour = String.valueOf(h);
        }else{
             year = "";
        }


        out.println("<html>");
        out.println("<head><title>Year to Hour</title></head>");
        out.println("<body>");
        out.println("<h3>YEAR TO HOUR CALCULATOR</h3>");

        out.println("<form method='get'>");
        out.println("<label>YEAR :</label><br>");

        out.println("<input name='year' value='"+year+"' /><br><br>");
         out.println("<input type='submit' value='Convert' style='background:yellow;' /><br><br>");
        out.println("<lable> HOUR : </lable> <br>");
		out.println("<input name='hresult' value ='"+hour+"'/>");

        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }
}
