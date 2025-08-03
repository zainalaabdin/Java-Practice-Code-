package Campus;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DBManager;
import model.DepartmentBean;

@WebServlet("/actionDeptForm")
public class ActionDeptForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	String idStr = request.getParameter("deptId");
    	String deptStr = request.getParameter("deptname");
    	String emailStr = request.getParameter("deptemail");
    	String codeStr = request.getParameter("deptcode");
    	String phoneStr = request.getParameter("deptphone");
    	String facultyIdStr = request.getParameter("facultyId");
    	  
    	String button = request.getParameter("submit");
    	DepartmentBean bean = new DepartmentBean();
    	
    	bean.setName(deptStr);
    	bean.setEmail(emailStr);
        bean.setCode(codeStr);
        bean.setPhone(phoneStr);
        
        if (facultyIdStr != null && !facultyIdStr.isEmpty()) {
            bean.setFacultyId(Integer.parseInt(facultyIdStr));
        }
        
        try {
			
        	if ("add".equals(button)) {
        	    DBManager.addDepartment(bean); 
        	    response.sendRedirect(request.getContextPath() + "/departmentView?message=Department+added+successfully");
        	
            }else if(button !=null && button.equals("update")){
            	int id = Integer.parseInt(idStr);
            	bean.setId(id);
            	DBManager.updateDepartment(bean);
            	response.sendRedirect(request.getContextPath() + "/departmentView?message=Department+updated+successfully");
            }else if(button !=null && button.equals("delete")) {
            	int id = Integer.parseInt(idStr);
            	DBManager.delDepartment(id);
            	response.sendRedirect(request.getContextPath() + "/departmentView?message=Department+deleted+successfully");
            }else if(button !=null && button.equals("clear")) {
            
            	response.sendRedirect(request.getContextPath() + "/departmentView?message=Department+clear+successfully");
            }else {
            	response.sendRedirect(request.getContextPath() + "/departmentView?message=Error+occurred");
            }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
    	
    }
}
