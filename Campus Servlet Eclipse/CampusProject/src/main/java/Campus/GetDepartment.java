package Campus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.DBManager;
import model.DepartmentBean;
import model.FacultyBean;

@WebServlet("/getDepartment")
public class GetDepartment extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idStr = request.getParameter("faculty_id");
        List<DepartmentBean> list = new ArrayList<>();
        List<FacultyBean> facultyList = new ArrayList<>();

        try {
            facultyList = DBManager.getFaculty();

            if (idStr != null && !idStr.isEmpty()) {
                int id = Integer.parseInt(idStr);
                list = DBManager.getDepartmentById(id); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("faculties", facultyList);
        request.setAttribute("departments", list);
        request.setAttribute("selectedFacultyId", idStr); 

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/dept.jsp");
        rd.forward(request, response);
    }
}
