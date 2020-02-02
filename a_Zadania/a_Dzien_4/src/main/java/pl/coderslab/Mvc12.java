package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Integer start = Integer.valueOf(request.getParameter("start"));
        final Integer end = Integer.valueOf(request.getParameter("end"));

        request.setAttribute("atrStart", start + 10);
        request.setAttribute("atrEnd", end + 10);

        getServletContext().getRequestDispatcher("/jsp2.jsp")
                .forward(request, response);
    }
}