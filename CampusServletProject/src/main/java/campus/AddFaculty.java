package campus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.google.gson.Gson;

import model.DBManager;
import model.FacultyBean;

@WebServlet("/addFaculty")
public class AddFaculty extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");

        BufferedReader reader = request.getReader();
        Gson gson = new Gson();
        FacultyBean bean = gson.fromJson(reader, FacultyBean.class);

        try {
            DBManager.addFaculty(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = response.getWriter();
        out.print("{\"message\": \"Record is saved\"}");
        out.flush();
    }
}
