package Campus;

import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.*;

@WebServlet("/batchView")
public class BatchView extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Fetch all faculties
            List<FacultyBean> facultyList = DBManager.getFaculty();
            request.setAttribute("facultyList", facultyList);

            // Get parameters
            String facultyIdStr = request.getParameter("facultyId");
            String departmentIdStr = request.getParameter("departmentId");

         
            if (facultyIdStr != null && !facultyIdStr.isEmpty()) {
                int facultyId = Integer.parseInt(facultyIdStr);
                List<DepartmentBean> departmentList = DBManager.getDepartmentById(facultyId);
                request.setAttribute("departmentList", departmentList);
                request.setAttribute("selectedFacultyId", facultyId);
            }

         
            if (departmentIdStr != null && !departmentIdStr.isEmpty()) {
                int deptId = Integer.parseInt(departmentIdStr);
                List<BatchBean> batchList = DBManager.getBatchById(deptId);
                request.setAttribute("batchList", batchList);
                request.setAttribute("selectedDepartmentId", deptId);

                String batchIdStr = request.getParameter("batchId");
            if (batchIdStr != null && !batchIdStr.isEmpty()) {
                    int batchId = Integer.parseInt(batchIdStr);
                    BatchBean batch = DBManager.getBatch(batchId); 
                    request.setAttribute("passBatch", batch);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/BatchView.jsp");
        dispatcher.forward(request, response);
    }
}
