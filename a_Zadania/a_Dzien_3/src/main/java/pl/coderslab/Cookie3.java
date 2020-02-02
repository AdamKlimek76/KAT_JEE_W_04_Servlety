package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie3")
public class Cookie3 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String key = request.getParameter("key");
        final String value = request.getParameter("value");
        final Integer time = Integer.parseInt(request.getParameter("time"));
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(60*60*time);
        response.addCookie(cookie);
    }

}
