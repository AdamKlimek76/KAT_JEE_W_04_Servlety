package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post5")
public class Form5 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Double degrees = Double.parseDouble(request.getParameter("degrees"));
        final String conversionType = request.getParameter("convertionType");

        if (conversionType.equals("celcToFahr")) {
            final Double convertion = (9 / 5) * degrees + 32;
            response.getWriter().println(degrees + " stopni Celsj to " + convertion  + " stopni Faranh");
        } else {
            final Double convertion = (5 / 9) * degrees - 32;
            response.getWriter().println(degrees + " stopni Faranh to " + convertion  + " stopni Celsj");
        }

    }
}