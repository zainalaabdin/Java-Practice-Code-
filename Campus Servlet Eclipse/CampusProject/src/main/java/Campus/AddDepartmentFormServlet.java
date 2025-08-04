package Campus;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DBManager;
import model.DepartmentBean;
import model.FacultyBean;


@WebServlet("/addDepartmentForm")
public class AddDepartmentFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id");

		try {
			if (idStr != null) {
				int id = Integer.parseInt(idStr);
				DepartmentBean department = DBManager.getDepartment(id);
				request.setAttribute("department", department);
			}
			
			
			List<FacultyBean> faculties = DBManager.getFaculty();  
			request.setAttribute("faculties", faculties);

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/addDepartmentForm.jsp");
		rd.forward(request, response);
	}
}
