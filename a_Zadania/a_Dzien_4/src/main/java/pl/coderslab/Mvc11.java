package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String inputRole = request.getParameter("role");

        if (inputRole != null) {
            request.setAttribute("user_role", "ROLE_" + inputRole.toUpperCase());
        }

        getServletContext().getRequestDispatcher("/jsp1.jsp")
                .forward(request, response);
    }


}
