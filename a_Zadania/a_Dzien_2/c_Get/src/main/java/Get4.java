import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Get4", urlPatterns = "/get4")
public class Get4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final Map<String, String[]> parameterMap = request.getParameterMap();
        final Iterator<String> iterator = parameterMap.keySet().iterator();

        while (iterator.hasNext()) {
            final String key = iterator.next();
            response.getWriter().println(key);
            List<String> list = Arrays.asList(parameterMap.get(key));
            for (int i = 0; i < list.size(); i++) {
                response.getWriter().println(" -" + list.get(i));
            }
        }
    }

}
