package log;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DBManager;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			Connection con = DBManager.getConnection();
			
			String sql = "SELECT * FROM login WHERE user_name = ? AND password = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("dashboardServlet"); 
			} else {
				
				response.sendRedirect("login.html?error=Invalid+credentials");
			}

			rs.close();
			ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		}

}
