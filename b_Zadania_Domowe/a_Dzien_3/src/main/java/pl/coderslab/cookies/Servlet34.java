package pl.coderslab.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet34")
public class Servlet34 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        boolean isCookieExist = false;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("visits")) {
                int value = Integer.parseInt(cookie.getValue());
                value++;
                cookie.setValue(String.valueOf(value));
                response.getWriter().append("Odwiedziles nas juz ").append(cookie.getValue()).append(" razy.");
                response.addCookie(cookie);
                isCookieExist = true;
                break;
            }
        }
        if (!isCookieExist) {
            response.getWriter().println("Witaj pierwszy raz na naszej stronie!");
            Cookie cookie = new Cookie("visits", "1");
            cookie.setMaxAge(60 * 60 * 24 * 365);
            response.addCookie(cookie);
        }
    }
}
