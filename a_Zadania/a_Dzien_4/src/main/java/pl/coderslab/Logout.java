package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class Logout extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        if (username != null) {
            session.removeAttribute("username");
            getServletContext().getRequestDispatcher("/logout.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/logout.jsp").forward(request, response);
        }
    }
}
