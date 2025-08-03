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


@WebServlet("/departmentView")
public class DepartmentView extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<FacultyBean> facultyList = DBManager.getFaculty();
            request.setAttribute("facultyList", facultyList);

            String facultyIdStr = request.getParameter("facultyId");
            
            if (facultyIdStr != null && !facultyIdStr.isEmpty()) {
                int facultyId = Integer.parseInt(facultyIdStr);
                List<DepartmentBean> departmentList = DBManager.getDepartmentById(facultyId);
                request.setAttribute("departmentList", departmentList);
                request.setAttribute("selectedFacultyId", facultyId); 
            }

            
            String deptIdStr = request.getParameter("deptId");
           
            
            if (deptIdStr != null && !deptIdStr.isEmpty()) {
                int deptId = Integer.parseInt(deptIdStr);
                DepartmentBean selectedDepartment = DBManager.getDepartment(deptId);
                request.setAttribute("passDept", selectedDepartment);
                request.setAttribute("selectedDeptId", deptId); 
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/DepartmentView.jsp");
        dispatcher.forward(request, response);
    }
}