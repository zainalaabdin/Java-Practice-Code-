package Campus;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.DBManager;
import model.DepartmentBean;

@WebServlet("/addDepartmentServlet")
public class AddDepartmentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idStr = request.getParameter("id");
        String name = request.getParameter("name");
        String code = request.getParameter("code");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String facultyIdStr = request.getParameter("faculty_id");

        try {
            DepartmentBean dept = new DepartmentBean();
            dept.setName(name);
            dept.setCode(code);
            dept.setEmail(email);
            dept.setPhone(phone);
            dept.setFacultyId(Integer.parseInt(facultyIdStr));

            if (idStr != null && !idStr.isEmpty()) {
                dept.setId(Integer.parseInt(idStr));
                DBManager.updateDepartment(dept);
                response.sendRedirect(request.getContextPath() + "/getDepartment?message=Department+updated+successfully");
            } else {
                DBManager.addDepartment(dept);
                response.sendRedirect(request.getContextPath() + "/getDepartment?message=Department+Added+successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Something went wrong!");
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/addDepartmentForm.jsp");
            rd.forward(request, response);
        }
    }
}
