package pl.coderslab.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/sess39")
public class Sess39 extends HttpServlet {

    private final static String FORM1 = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"sess39\" method=\"POST\">\n" +
            "    <label>";
    private final static String FORM2 = "<input type=\"text\" name=\"capital\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    private final static String[] countries = {" Niemcy:", " Czechy:", " Slowacja:", " Ukraina:"};
    private final static String[] capitals = {"Berlin", "Praga", "Bratyslawa", "Kijow"};

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
        HttpSession session = request.getSession();
        Integer counter = (Integer) request.getAttribute("counter");
        response.getWriter().println(counter);
        if (counter == null) {
            session.setAttribute("counter", 0);
            counter=0;
        }
        Integer correctAnswersNumber = (Integer) request.getAttribute("correctAnswers");
        if (correctAnswersNumber == null) {
            session.setAttribute("correctAnswers", 0);
            correctAnswersNumber=0;
        }
        String answer = request.getParameter("capital");
        if (answer.equals(capitals[counter])) {
            correctAnswersNumber++;
        }
        counter++;

        if (counter == 4) {
            response.getWriter().append("Poprawnych odpowiedzi: ").append(String.valueOf(correctAnswersNumber));
        } else {
            session.setAttribute("counter", counter);
            session.setAttribute("correctAnswers", correctAnswersNumber);
            response.getWriter().append(FORM1).append("Podaj stolice Panstwa: ").append(countries[counter]).append(FORM2);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append(FORM1).append("Podaj stolice Panstwa: ").append(countries[0]).append(FORM2);
        HttpSession session = request.getSession();
        session.setAttribute("counter", 0);
        session.setAttribute("correctAnswers", 0);
    }
}
