package Campus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import model.DBManager;
import model.FacultyBean;


@WebServlet("/addFacultyForm")
public class AddFacultyForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idStr = request.getParameter("id");
		if (idStr != null) {
            try {
                int id = Integer.parseInt(idStr);
                FacultyBean faculty = DBManager.getFacultyById(id);
                request.setAttribute("faculty", faculty);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/addFacultyForm.jsp");
        rd.forward(request, response);
	}

}
