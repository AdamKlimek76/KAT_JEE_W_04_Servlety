package pl.coderslab.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rememberMe")
public class Cookie37 extends HttpServlet {

    final private static String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"rememberMe\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Nazwa:\n" +
            "        <input type=\"text\" name=\"name\">\n" +
            "    </label>\n" +
            "    <input type=\"checkbox\" name=\"remember\" value=\"rememberMe\">Zapamietaj mnie\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isNameInput = true;

        String name = request.getParameter("name");
        if (name.equals("")) {
            response.getWriter().println("Podaj imie");
            isNameInput = false;
        }

        if (isNameInput) {
            String checkbox = request.getParameter("remember");
            if (checkbox == null) {
                response.getWriter().append("Czesc ").append(name);
            } else {
                Cookie cookie = new Cookie("remember", name);
                response.addCookie(cookie);
                response.getWriter().append("Czesc ").append(name);
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Cookie[] cookies = request.getCookies();
            boolean isCookieExist = false;
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("remember")) {
                    response.getWriter().append("Czesc ").append(cookie.getValue())
                    .append(". Twoje dane zostaly wczytane z ciasteczka.");
                    isCookieExist = true;
                    break;
                }
            }
            if (!isCookieExist) {
                response.getWriter().println(FORM);
            }
        } catch (NullPointerException e) {
            response.getWriter().println(FORM);
        }

    }
}
