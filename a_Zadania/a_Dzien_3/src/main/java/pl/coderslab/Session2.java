package pl.coderslab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    private final static String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"session2\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Ocena:\n" +
            "        <input type=\"number\" name=\"degree\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        response.setContentType("text/html; utf-8");
        response.getWriter().println(FORM);
    }

    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
            IOException {
        final HttpSession session = request.getSession();
        List<Integer> degrees = getDegrees(session);
        degrees.add(Integer.valueOf(request.getParameter("degree")));
        session.setAttribute("degrees", degrees);

        response.getWriter().println(degrees);
        response.getWriter().println(computeAverage(degrees));
    }

    private double computeAverage(final List<Integer> degrees) {
        double sum = 0;
        for (Integer value : degrees) {
            sum += value;
        }
        return sum / degrees.size();
    }

    private List<Integer> getDegrees(final HttpSession session) {
        List<Integer> degrees = (List) session.getAttribute("degrees");
        if (degrees == null) {
            degrees = new ArrayList<>();
        }
        return degrees;
    }
}
