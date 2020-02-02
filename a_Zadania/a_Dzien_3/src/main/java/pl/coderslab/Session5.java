package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/session5")
public class Session5 extends HttpServlet {

    private final static String FORM_BEFORE = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"session5\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Imie:\n" +
            "        <input type=\"text\" name=\"imie\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Nazwisko:\n" +
            "        <input type=\"text\" name=\"nazwisko\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Email:\n" +
            "        <input type=\"text\" name=\"email\">\n" +
            "    </label>\n";
    private final static String FORM_AFTER = " <label>\n" +
            "        Wynik:\n" +
            "        <input type=\"number\" name=\"wynik\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; utf-8");
        // response.getWriter().println(FORM);
        Random r = new Random();
        Integer a = r.nextInt(101);
        Integer b = r.nextInt(101);
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        response.getWriter().append(FORM_BEFORE).append("</br>")
                .append(aStr).append(" + ").append(bStr).append(" = ").append(FORM_AFTER);
        HttpSession session = request.getSession();
        session.setAttribute("captcha", a + b);

    }

    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
            IOException {
        Integer result = Integer.parseInt(request.getParameter("wynik"));
        HttpSession session = request.getSession();
        Integer catpcha = (Integer) session.getAttribute("captcha");
        if (result.equals(catpcha)) {
            String imie = request.getParameter("imie");
            String nazwisko = request.getParameter("nazwisko");
            String email = request.getParameter("email");
            response.getWriter().append("Dane użytkownika: ").append(imie).append(" ").append(nazwisko).append(" ")
                    .append(email);
        } else {
            response.getWriter().println("Podałeś błędny wynik");
        }
    }
}
