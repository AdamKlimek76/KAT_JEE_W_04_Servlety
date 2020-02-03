package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/servlet311")
public class Servlet311 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            request.setAttribute("greeting", "Czesc");
        } else {
            boolean isCookieExist = false;
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("language")) {
                    request.setAttribute("greeting", cookie.getValue());
                    isCookieExist = true;
                    break;
                }
            }
            if (!isCookieExist) {
                request.setAttribute("greeting", "Czesc");
            }
        }

        Map<String, String> langs = new HashMap<>();
        langs.put("en", "Hello");
        langs.put("pl", "Czesc");
        langs.put("de", "Hallo");
        langs.put("es", "Hola");
        langs.put("fr", "Salut");

        request.setAttribute("langs", langs);

        getServletContext().getRequestDispatcher("/servlet311.jsp")
                .forward(request, response);
    }
}
