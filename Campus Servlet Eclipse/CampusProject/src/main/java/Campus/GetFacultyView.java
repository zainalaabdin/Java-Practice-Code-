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
import model.FacultyBean;

@WebServlet("/getFacultyView")
public class GetFacultyView extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idStr = request.getParameter("id");
        FacultyBean facultyBean = null;

        try {
            if (idStr != null && !idStr.isEmpty()) {
                int id = Integer.parseInt(idStr);
                facultyBean = DBManager.getFacultyById(id);
                request.setAttribute("passFaculty", facultyBean);
            }

            List<FacultyBean> list = DBManager.getFaculty();
            request.setAttribute("faculties", list);

        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/FacultyView.jsp");
        rd.forward(request, response);
    }
}
