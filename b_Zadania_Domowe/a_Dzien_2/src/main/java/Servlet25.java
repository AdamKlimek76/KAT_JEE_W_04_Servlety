import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet(name = "Servlet25", urlPatterns = "/servlet25")
public class Servlet25 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random r = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = r.nextInt(100) + 1;
        }
        response.getWriter().println("Lista niesortowana:");
        for (int i = 0; i < randomNumbers.length; i++) {
            response.getWriter().println(randomNumbers[i]);
        }
        response.getWriter().println("Lista sortowana:");
        Arrays.sort(randomNumbers);
        for (int i = 0; i < randomNumbers.length; i++) {
            response.getWriter().println(randomNumbers[i]);
        }
    }

}
