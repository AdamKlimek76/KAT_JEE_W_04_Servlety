package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cookie1Del")
public class Cookie1Del extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Cookie user = Cookie1Get.getCookieUser(request.getCookies());
        if (user != null) {
            user.setMaxAge(0);
            response.addCookie(user);
        } else {
            response.getWriter().println("BRAK");
        }
    }
}
