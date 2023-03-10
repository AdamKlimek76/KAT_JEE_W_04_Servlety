package pl.coderslab;

import pl.coderslab.dao.UserDao;
import pl.coderslab.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@WebServlet("/newsletter")
public class Newsletter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("form", "1");
        cookie.setMaxAge(10);
        response.addCookie(cookie);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        saveUser(name, email);
        UserDao userDao = new UserDao();
        request.setAttribute("userList", userDao.findAll());

        getServletContext().getRequestDispatcher("/newsletter.jsp")
                .forward(request, response);
    }



    private void saveUser(String name, String email) {
        User user = new User(1, name, email);
        UserDao userDao = new UserDao();
        User user1 = userDao.create(user);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        getServletContext().getRequestDispatcher("/newsletter.jsp")
                .forward(request, response);
    }
}
