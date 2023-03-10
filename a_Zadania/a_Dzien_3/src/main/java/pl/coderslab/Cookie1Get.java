package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showCookie")
public class Cookie1Get extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie user = getCookieUser(request.getCookies());
        response.getWriter().println("User: " + user.getValue());
    }

    public static Cookie getCookieUser(final Cookie[] cookies) {
        Cookie user = null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("User")) {
                user = cookie;
            }
        }
        return user;
    }



}
