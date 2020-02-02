package pl.coderslab.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet36")
public class Servlet36 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] numbers = request.getParameterValues("num");
        response.getWriter().println("Liczby:");
        int sum = 0;
        int ratio = 1;
        for (int i = 0; i < numbers.length; i++) {
            response.getWriter().println(numbers[i]);
            sum += Integer.parseInt(numbers[i]);
            ratio *= Integer.parseInt(numbers[i]);
        }
        double average = sum / 4.;
        response.getWriter().println("Srednia:");
        response.getWriter().println(average);
        response.getWriter().println("Suma:");
        response.getWriter().println(sum);
        response.getWriter().println("Iloczyn:");
        response.getWriter().println(ratio);
    }
}
