import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ActionCalculator extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
		
      String n1 = request.getParameter("num1");
      String n2 = request.getParameter("num2");

      int num1 = Integer.parseInt(n1);
      int num2 = Integer.parseInt(n2);
      
      String symbol = request.getParameter("symbol");

      if(symbol.equals("+")){
        out.println(num1 + num2);
      }else if(symbol.equals("-")){
        out.println(num1 - num2);
      }else if(symbol.equals("*")){
        out.println(num1 * num2);
      }else if(symbol.equals("/")){
        out.println(num1 / num2);
      }else if(symbol.equals("%")){
        out.println(num1 % num2);
      }
    }
}