package Campus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DBManager;
import model.FacultyBean;

/**
 * Servlet implementation class ActionForm
 */
@WebServlet("/actionForm")
public class ActionForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String idStr = request.getParameter("id");
        String facultyName = request.getParameter("name");
        String remarks = request.getParameter("remarks");
        
        String button = request.getParameter("submit");
        
        FacultyBean bean = new FacultyBean();
        bean.setName(facultyName);
        bean.setRemarks(remarks);

		try {
			
			if(button !=null && button.equals("add")) {
        		int id = Integer.parseInt(idStr);
        		bean.setId(id);
	            DBManager.addFaculty(bean);
	            response.sendRedirect(request.getContextPath() + "/getFacultyView?message=Faculty+added+successfully");
            }else if(button !=null && button.equals("update")){
            	int id = Integer.parseInt(idStr);
            	bean.setId(id);
            	DBManager.updateFaculty(bean);
            	response.sendRedirect(request.getContextPath() + "/getFacultyView?message=Faculty+updated+successfully");
            }else if(button !=null && button.equals("delete")) {
            	 int id = Integer.parseInt(idStr);
            	DBManager.delFaculty(id);
            	response.sendRedirect(request.getContextPath() + "/getFacultyView?message=Faculty+deleted+successfully");
            }else if(button !=null && button.equals("clear")) {
            
            	response.sendRedirect(request.getContextPath() + "/getFacultyView?message=Faculty+clear+successfully");
            }else {
            	response.sendRedirect(request.getContextPath() + "/getFacultyView?message=Error+occurred");
            }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
