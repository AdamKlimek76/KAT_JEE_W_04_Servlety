package pl.coderslab.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isBinaryDigit = true;
        String binaryStr = request.getParameter("binary");
        for (int i = 0; i < binaryStr.length(); i++) {
            Integer binaryDigit = Integer.parseInt(binaryStr.substring(i, i + 1));
            if (!(binaryDigit.equals(0) | binaryDigit.equals(1))) {
                isBinaryDigit = false;
                response.getWriter().println("Tylko 0 lub 1");
                break;
            }
        }
        if (isBinaryDigit) {
            Double j = 0.;
            int digitNumber = 0;
            for (int i = binaryStr.length() - 1; i > -1; i--) {
                digitNumber += Integer.parseInt((binaryStr.substring(i, i + 1))) * Math.pow(2., j);
                j++;
            }

            response.getWriter().append("Liczba dziesietna to: ").append(String.valueOf(digitNumber));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
