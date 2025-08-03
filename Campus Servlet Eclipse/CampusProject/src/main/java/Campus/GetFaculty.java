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
import model.FacultyBean;



@WebServlet("/home")
public class GetFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<FacultyBean> list = null;
		try {
			list = DBManager.getFaculty();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		request.setAttribute("faculties", list);
		
	    RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/faculty.jsp");
	    rd.forward(request, response);
	}

}
