package Campus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.DBManager;
import model.FacultyBean;

@WebServlet("/addFacultyServlet")

public class AddFacultyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String idStr = request.getParameter("id");
        String facultyName = request.getParameter("name");
        String remarks = request.getParameter("remarks");

        FacultyBean bean = new FacultyBean();
        bean.setName(facultyName);
        bean.setRemarks(remarks);

        try {
        	if(idStr != null && !idStr.isEmpty()) {
        		int id = Integer.parseInt(idStr);
        		bean.setId(id);
	            DBManager.addFaculty(bean);
	            response.sendRedirect(request.getContextPath() + "/home?message=Faculty+updated+successfully");
            } else {
                DBManager.addFaculty(bean);
                response.sendRedirect(request.getContextPath() + "/home?message=Faculty+added+successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/home?message=Error+occurred");
        }
    }
}
