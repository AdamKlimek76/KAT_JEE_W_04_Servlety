import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;


@WebServlet(name = "Servlet", urlPatterns = "/servlet14")
public class Servlet14 extends HttpServlet {

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.getWriter().println(request.getHeader("User-Agent"));
            response.getWriter().println(request.getRemoteAddr());
        }
    }
