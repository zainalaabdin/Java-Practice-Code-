import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/atm")
public class Atm extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int fth = 0, th = 0, fi = 0, hu = 0, fif = 0, tw = 0, ten = 0, fiv = 0, two = 0, one = 0;
        String totalAmount = "";

        String amount = request.getParameter("amount");

            if(amount !=null){
                int a = Integer.parseInt(amount);
                fth = a / 5000;
                a %= 5000;
                th = a / 1000;
                a %= 1000;
                fi = a / 500;
                a %= 500;
                hu = a / 100;
                a %= 100;
                fif = a / 50;
                a %= 50;
                tw = a / 20;
                a %= 20;
                ten = a / 10;
                a %= 10;
                fiv = a / 5;
                a %= 5;
                two = a / 2;
                a %= 2;
                one  = a / 1;
                a %= 1; 
               
                }

        out.println("<html>");
        out.println("<head><title>SEPRATE NOTE ATM</title></head>");
        out.println("<body>");

        out.println("<form method ='get'>");
        out.println("<input name='amount' type='number' value='"+totalAmount+"' /></br></br>");
        out.println("<input type='submit' value='Get Notes' /><br><br>");

        out.println("5000 Note: <input type='text' value='" + fth + "' readonly /><br><br>");
        out.println("1000 Note: <input type='text' value='" + th + "' readonly /><br><br>");
        out.println("500 Note: <input type='text' value='" + fi + "' readonly /><br><br>");
        out.println("100 Note: <input type='text' value='" + hu + "' readonly /><br><br>");
        out.println("50 Note: <input type='text' value='" + fif + "' readonly /><br><br>");
        out.println("20 Note: <input type='text' value='" + tw + "' readonly /><br><br>");
        out.println("10 Note: <input type='text' value='" + ten + "' readonly /><br><br>");
        out.println("5 Note: <input type='text' value='" + fiv + "' readonly /><br><br>");
        out.println("2 Note: <input type='text' value='" + two + "' readonly /><br><br>");
        out.println("1 Note: <input type='text' value='" + one + "' readonly /><br><br>");
                
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }
}