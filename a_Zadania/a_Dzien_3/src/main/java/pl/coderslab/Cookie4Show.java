package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Cookie[] cookies = request.getCookies();
        Cookie cookie1 = new Cookie("adam", "klim");
        Cookie cookie2 = new Cookie("adam2", "klim2");
        Cookie cookie3 = new Cookie("adam3", "klim3");
        Cookie[] cookies={cookie1, cookie2, cookie3};
        for (Cookie cookie : cookies) {
            response.addCookie(cookie);
            response.getWriter().println(cookie);
            String cookieName=cookie.getName();
            response.getWriter().println(cookieName);
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().append("<a href=localhost:8080/removeCookie?name=").append(cookieName).append(">Usun ciasteczko</a><br>");
            }

        }
    }
