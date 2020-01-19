import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "Servlet241", urlPatterns = "/servlet241")
public class Servlet241 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random r = new Random();
        Integer idProduct = r.nextInt(11);
        String idProductStr = Integer.toString(idProduct);
        response.getWriter().append("<a href=localhost:8080/servlet242?idProdukt=").append(idProductStr).append(">Pobierz produkt</a>");
    }
}
