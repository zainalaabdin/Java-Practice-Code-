package Campus;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import model.DBManager;
import model.StudentBean;

@WebServlet("/actionStudentForm")
public class ActionStudentForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("studentId");
        String name = request.getParameter("studentName");
        String rollNum = request.getParameter("studentRoll");
        String email = request.getParameter("studentEmail");
        String phone = request.getParameter("studentPhone");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String address = request.getParameter("address");
        String admission = request.getParameter("admission");
        String remarks = request.getParameter("remarks");
        String batchIdStr = request.getParameter("batchId");
        String button = request.getParameter("submit");

        StudentBean bean = new StudentBean();
        bean.setName(name);
        bean.setRollNum(rollNum);
        bean.setEmail(email);
        bean.setPhone(phone);
        bean.setGender(gender);
        bean.setDateOfBirth(dob);
        bean.setAddress(address);
        bean.setAdmission(admission);
        bean.setRemarks(remarks);

        try {
            if (batchIdStr != null && !batchIdStr.isEmpty()) {
                bean.setBatchId(Integer.parseInt(batchIdStr));
            }

            if ("add".equals(button)) {
                DBManager.addStudent(bean);
                response.sendRedirect("studentView?message=Student+added+successfully");

            } else if ("update".equals(button) && idStr != null && !idStr.isEmpty()) {
                bean.setId(Integer.parseInt(idStr));
                DBManager.updateStudent(bean);
                response.sendRedirect("studentView?message=Student+updated+successfully");

            } else if ("update".equals(button)) {
                response.sendRedirect("studentView?message=Student+ID+missing+for+update");

            } else if ("delete".equals(button) && idStr != null && !idStr.isEmpty()) {
                int id = Integer.parseInt(idStr);
                DBManager.delStudent(id);
                response.sendRedirect("studentView?message=Student+deleted+successfully");

            } else if ("delete".equals(button)) {
                response.sendRedirect("studentView?message=Student+ID+missing+for+delete");

            } else if ("clear".equals(button)) {
                response.sendRedirect("studentView?message=Form+cleared");

            } else {
                response.sendRedirect("studentView?message=Unknown+action");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("studentView?message=Error+occurred");
        }
    }
}
