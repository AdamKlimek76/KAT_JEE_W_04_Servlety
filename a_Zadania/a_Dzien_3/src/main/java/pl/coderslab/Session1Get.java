package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session1Get")
public class Session1Get extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final HttpSession session = request.getSession();
        Integer counter = (Integer) session.getAttribute("counter");

        if (counter != null) {
            counter++;
            session.setAttribute("counter", counter);
            response.getWriter().println(counter);
        } else {
            response.getWriter().println("EMPTY");
        }
    }

}
