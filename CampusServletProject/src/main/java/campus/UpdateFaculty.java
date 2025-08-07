package campus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.DBManager;
import model.FacultyBean;

@WebServlet("/updateFaculty")
public class UpdateFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("application/json");

        BufferedReader reader = request.getReader();
        Gson gson = new Gson();
        FacultyBean bean = gson.fromJson(reader, FacultyBean.class);

        try {
            DBManager.updateFaculty(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = response.getWriter();
        out.print("{\"message\": \"Record is saved\"}");
        out.flush();
		
	}

}
