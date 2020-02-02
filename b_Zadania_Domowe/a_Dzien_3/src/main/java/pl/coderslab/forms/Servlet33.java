package pl.coderslab.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/servlet33")
public class Servlet33 extends HttpServlet {

    private final static String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"servlet33\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Parametr a:\n" +
            "        <input type=\"text\" name=\"a\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Parametr b:\n" +
            "        <input type=\"text\" name=\"b\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Parametr c:\n" +
            "        <input type=\"text\" name=\"c\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Parametr d:\n" +
            "        <input type=\"text\" name=\"d\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Parametr e:\n" +
            "        <input type=\"text\" name=\"e\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";
    private final static String FORM1 = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"servlet33\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Parametr a:\n" +
            "        <input type=\"text\" name=\"a\" value=";
    private final static String FORM2 = ">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Parametr b:\n" +
            "        <input type=\"text\" name=\"b\" value=";
    private final static String FORM3 = ">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Parametr c:\n" +
            "        <input type=\"text\" name=\"c\" value=";
    private final static String FORM4 = ">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Parametr d:\n" +
            "        <input type=\"text\" name=\"d\" value=";
    private final static String FORM5 = ">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Parametr e:\n" +
            "        <input type=\"text\" name=\"e\" value=";
    private final static String FORM6 = ">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String c = request.getParameter("c");
        String d = request.getParameter("d");
        String e = request.getParameter("e");
        session.setAttribute("a", a);
        session.setAttribute("b", b);
        session.setAttribute("c", c);
        session.setAttribute("d", d);
        session.setAttribute("e", e);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String a = (String) session.getAttribute("a");
        String b = (String) session.getAttribute("b");
        String c = (String) session.getAttribute("c");
        String d = (String) session.getAttribute("d");
        String e = (String) session.getAttribute("e");
        if (a != null | b != null | c != null | d != null | e != null) {
            response.getWriter().append(FORM1).append(a)
                    .append(FORM2).append(b)
                    .append(FORM3).append(c)
                    .append(FORM4).append(d)
                    .append(FORM5).append(e).append(FORM6);
        } else {
            response.getWriter().println(FORM);
        }
    }
}
