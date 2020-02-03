package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet312")
public class Servlet312 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String greeting = request.getParameter("langs");
        if (greeting.equals("")) {
            greeting = "Czesc";
        }
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            Cookie cookie = new Cookie("language", greeting);
            response.addCookie(cookie);
        } else {
            boolean isCookieExist = false;
            for (Cookie cookie : cookies) {
                if (cookie.equals("language")) {
                    cookie.setValue(greeting);
                    response.addCookie(cookie);
                    isCookieExist = true;
                    break;
                }
            }
            if (!isCookieExist) {
                Cookie cookie = new Cookie("language", greeting);
                response.addCookie(cookie);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
