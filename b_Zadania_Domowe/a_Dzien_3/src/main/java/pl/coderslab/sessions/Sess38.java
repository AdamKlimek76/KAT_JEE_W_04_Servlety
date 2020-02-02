package pl.coderslab.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/sess38")
public class Sess38 extends HttpServlet {

    private final static String FORM1 = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"sess38\" method=\"POST\">";
    private final static String FORM2 = "<label>\n" +
            "        <input type=\"number\" name=\"addition\"><br>\n" +
            "    </label>";
    private final static String FORM3 = "<label>\n" +
            "        <input type=\"number\" name=\"subtraction\"><br>\n" +
            "    </label>";
    private final static String FORM4 = "<label>\n" +
            "        <input type=\"number\" name=\"multiplication\"><br>\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int a = (int) session.getAttribute("a");
        int b = (int) session.getAttribute("b");
        int additionResult = Integer.parseInt(request.getParameter("addition"));
        int subtractionResult = Integer.parseInt(request.getParameter("subtraction"));
        int multiplicationResult = Integer.parseInt(request.getParameter("multiplication"));
        String addEvaluation = "";
        String subEvaluation = "";
        String mulEvaluation = "";
        if (a + b == additionResult) {
            addEvaluation = "Correct";
        } else {
            addEvaluation = "Wrong";
        }
        if (a - b == subtractionResult) {
            subEvaluation = "Correct";
        } else {
            subEvaluation = "Wrong";
        }
        if (a * b == multiplicationResult) {
            mulEvaluation = "Correct";
        } else {
            mulEvaluation = "Wrong";
        }

        response.getWriter().append(String.valueOf(a)).append(" + ").append(String.valueOf(b)).append(" = ")
                .append(String.valueOf(additionResult)).append(" ").append(addEvaluation);
        response.getWriter().println("");
        response.getWriter().append(String.valueOf(a)).append(" - ").append(String.valueOf(b)).append(" = ")
                .append(String.valueOf(subtractionResult)).append(" ").append(subEvaluation);
        response.getWriter().println("");
        response.getWriter().append(String.valueOf(a)).append(" * ").append(String.valueOf(b)).append(" = ")
                .append(String.valueOf(multiplicationResult)).append(" ").append(mulEvaluation);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int a = random.nextInt(981) + 20;
        int b = random.nextInt(981) + 20;
        HttpSession session = request.getSession();
        session.setAttribute("a", a);
        session.setAttribute("b", b);

        response.getWriter().append(FORM1).append(String.valueOf(a)).append(" + ").append(String.valueOf(b)).append(" = ")
                .append(FORM2).append(String.valueOf(a)).append(" - ").append(String.valueOf(b)).append(" = ")
                .append(FORM3).append(String.valueOf(a)).append(" * ").append(String.valueOf(b)).append(" = ")
                .append(FORM4);
    }
}
