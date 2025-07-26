import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<form method = \"get\" >");
		out.println("<h1> CALCULATOR </h1>");
		out.println("<label>Enter First Number : </label>");
		out.println("<input id='num1' name='num1' value=''/></br></br>");
		out.println("<label>Enter Second Number : </label>");
		out.println("<input id='num2' name='num2' value=''/></br></br>");
		out.println("<input class='button' type='submit' name='symbol' value='+' />");
		out.println("<input class='button' type='submit' name='symbol' value='-' />");
		out.println("<input class='button' type='submit' name='symbol' value='*' />");
		out.println("<input class='button' type='submit' name='symbol' value='/' />");
		out.println("<input class='button' type='submit' name='symbol' value='%' /></br></br>");
		
		String result = "";

		if(request.getParameter("num1") != null){
			String n1 = request.getParameter("num1");
			String n2 = request.getParameter("num2");

			int num1 = Integer.parseInt(n1);
			int num2 = Integer.parseInt(n2);
			
			String symbol = request.getParameter("symbol");

			   switch (symbol) {
                    case "+":
                        result = String.valueOf(num1 + num2);
                        break;
                    case "-":
                        result = String.valueOf(num1 - num2);
                        break;
                    case "*":
                        result = String.valueOf(num1 * num2);
                        break;
                    case "/":
                        result = String.valueOf(num1 / num2);
                        break;
                    case "%":
                        result = String.valueOf(num1 % num2);
                        break;
                    default:
                        result = "Invalid Operation";
                }
		}

		out.println("<label>Result : </label>");
		out.println("<input id='num3' name='num3' value='"+result+"'/></br></br>");

		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}