import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/input2")
public class InputServletExample2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operation = request.getParameter("operation");

        if (num1 == null || num1.isEmpty()) {
            response.sendRedirect("error?message=Please give first input");
            return;
        } else if (num2 == null || num2.isEmpty()) {
            response.sendRedirect("error?message=Please give second input");
            return;
        } else if (operation == null || operation.isEmpty()) {
            response.sendRedirect("error?message=Please select an operation");
            return;
        }

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int result = 0;
        boolean validOperator = true;

        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "sub":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                result = a / b;
                break;
            default:
                validOperator = false;
                break;
        }


        request.setAttribute("ans", result);
        RequestDispatcher rd = request.getRequestDispatcher("ans");
        rd.forward(request, response);
    }
}
