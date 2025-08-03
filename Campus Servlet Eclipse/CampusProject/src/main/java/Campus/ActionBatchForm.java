package Campus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BatchBean;
import model.DBManager;

/**
 * Servlet implementation class ActionBatchForm
 */
@WebServlet("/actionBatchForm")
public class ActionBatchForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idStr = request.getParameter("batchId");
		String nameStr = request.getParameter("batchName");
		String startStr = request.getParameter("startYear");
		String endStr = request.getParameter("endYear");
		String remarksStr = request.getParameter("remarks");
		String deptIdStr = request.getParameter("departmentId");

		String button = request.getParameter("submit");

		BatchBean bean = new BatchBean();

		bean.setName(nameStr);
		bean.setStartYear(startStr);
		bean.setEndYear(endStr);
		bean.setRemarks(remarksStr);
		
		if(deptIdStr != null && !deptIdStr.isEmpty()) {
			bean.setDeptId(Integer.parseInt(deptIdStr));
		}
			try {
			
        	if (button !=null && button.equals("add")) {
        	    DBManager.addBatch(bean); 
        	    response.sendRedirect(request.getContextPath() + "/batchView?message=batch+added+successfully");
        	
            }else if(button !=null && button.equals("update")){
            	int id = Integer.parseInt(idStr);
            	bean.setId(id);
            	DBManager.updateBatch(bean);
            	response.sendRedirect(request.getContextPath() + "/batchView?message=batch+updated+successfully");
            } else if (button != null && button.equals("delete")) {
                int id = Integer.parseInt(idStr);
                DBManager.deleteBatch(id);
                response.sendRedirect(request.getContextPath() + "/batchView?message=batch+deleted+successfully");
            }else if(button !=null && button.equals("clear")) {
            
            	response.sendRedirect(request.getContextPath() + "/batchView?message=batch+clear+successfully");
            }else {
            	response.sendRedirect(request.getContextPath() + "/departmentView?message=Error+occurred");
            }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
