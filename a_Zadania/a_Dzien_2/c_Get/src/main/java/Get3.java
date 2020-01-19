import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Get3", urlPatterns = "/get3")
public class Get3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final Integer width = parseToInt(request.getParameter("width"), 5);
        final Integer height = parseToInt(request.getParameter("height"), 10);
        Integer[][] matrix = new Integer[width][height];
        if (width != null && height != null) {
            String str = "";
            for (int i = 1; i < height + 1; i++) {
                str = "";
                for (int j = 1; j < width + 1; j++) {
                    int result = i * j;
                    String strResult = Integer.toString(result);
                    str = str + " " + strResult;

                }
                response.getWriter().println(str);
            }
        } else {
            response.getWriter().println("BRAK");
        }
    }

    private static Integer parseToInt(final String string, final Integer integer) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException exception) {
            return integer;
        }
    }
}
