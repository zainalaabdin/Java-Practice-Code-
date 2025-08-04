package Campus;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.DBManager;
import model.FacultyBean;
import model.DepartmentBean;
import model.BatchBean;
import model.StudentBean;

@WebServlet("/studentView")
public class StudentView extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Faculty list always needed
            List<FacultyBean> facultyList = DBManager.getFaculty();
            request.setAttribute("facultyList", facultyList);

            String facultyIdStr = request.getParameter("facultyId");
            String deptIdStr = request.getParameter("deptId");
            String batchIdStr = request.getParameter("batchId");
            String studentIdStr = request.getParameter("studentId");

            if (facultyIdStr != null && !facultyIdStr.isEmpty()) {
                int facultyId = Integer.parseInt(facultyIdStr);
                request.setAttribute("selectedFacultyId", facultyId);

                
                List<DepartmentBean> departmentList = DBManager.getDepartmentById(facultyId);
                request.setAttribute("departmentList", departmentList);

                if (deptIdStr != null && !deptIdStr.isEmpty()) {
                    int deptId = Integer.parseInt(deptIdStr);
                    request.setAttribute("selectedDeptId", deptId);

                  
                    List<BatchBean> batchList = DBManager.getBatchById(deptId);
                    request.setAttribute("batchList", batchList);

                if (batchIdStr != null && !batchIdStr.isEmpty()) {
                    int batchId = Integer.parseInt(batchIdStr);
                    request.setAttribute("selectedBatchId", batchId);

                  
                    List<StudentBean> studentList = DBManager.getStudentsByBatch(batchId);
                    request.setAttribute("studentList", studentList);

                if (studentIdStr != null && !studentIdStr.isEmpty()) {
                    int studentId = Integer.parseInt(studentIdStr);
                    StudentBean selectedStudent = DBManager.getStudentById(studentId);
                    request.setAttribute("passStudent", selectedStudent);
                    request.setAttribute("selectedStudentId", studentId);
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/StudentView.jsp");
        dispatcher.forward(request, response);
    }
}
