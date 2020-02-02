package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addToSession")
public class Session3Add extends HttpServlet {

    private final static String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"addToSession\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Klucz:\n" +
            "        <input type=\"text\" name=\"key\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Wartość:\n" +
            "        <input type=\"text\" name=\"value\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; utf-8");
        response.getWriter().println(FORM);
    }

    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
            IOException {
        HttpSession session = request.getSession();
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        List<String> keys = (List) session.getAttribute("atrybut");
        if (keys == null) {
            keys = new ArrayList<>();
        }
        keys.add(key);
        session.setAttribute("atrybut", keys);
        session.setAttribute(key, value);
        for (int i = 0; i < keys.size(); i++) {
            response.getWriter().println(keys.get(i));
        }
        response.getWriter().println(keys);

    }
}
