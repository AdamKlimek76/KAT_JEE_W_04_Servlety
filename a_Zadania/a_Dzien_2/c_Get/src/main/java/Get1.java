import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Get1", urlPatterns = "/get1")
public class Get1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final Integer start = parseToInt(request.getParameter("start"));
        final Integer end = parseToInt(request.getParameter("end"));
        if (start != null && end != null) {
            for (int i = start; i <= end; i++) {
                response.getWriter().println(i);
            }
        } else {
            response.getWriter().println("BRAK");
        }
    }

    private static Integer parseToInt(final String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException exception) {
            return null;
        }
    }

}
