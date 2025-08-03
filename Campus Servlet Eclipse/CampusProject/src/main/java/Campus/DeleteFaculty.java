package Campus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DBManager;

@WebServlet("/deleteFaculty")
public class DeleteFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    String idStr = request.getParameter("id");

	    if (idStr != null && !idStr.isEmpty()) {
	        try {
	            int id = Integer.parseInt(idStr);
	            DBManager.delFaculty(id);
	            response.sendRedirect(request.getContextPath() + "/home?message=Faculty+deleted+successfully");
	        } catch (Exception e) {
	            e.printStackTrace();
	            response.sendRedirect(request.getContextPath() + "/home?message=Error+deleting+faculty");
	        }
	    } else {
	        response.sendRedirect(request.getContextPath() + "/home?message=Invalid+faculty+ID");
	    }
	}
}

