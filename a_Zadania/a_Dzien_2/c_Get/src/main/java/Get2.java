import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;


@WebServlet(name = "Get2", urlPatterns = "/get2")
public class Get2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Map<String, String[]> parameterMap = request.getParameterMap();
        final Iterator<String> iterator = parameterMap.keySet().iterator();

        while (iterator.hasNext()) {
            final String key = iterator.next();
            response.getWriter().println(key + " : " + Arrays.toString(parameterMap.get(key)));
        }
    }
}
