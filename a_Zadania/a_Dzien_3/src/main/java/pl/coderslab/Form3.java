package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getForm3")
public class Form3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final Integer number = Integer.parseInt(request.getParameter("page"));
        for (int i = 1; i < number + 1; i++) {
            if (number % i == 0) {
                response.getWriter().println(i);
            }
        }
    }
}

