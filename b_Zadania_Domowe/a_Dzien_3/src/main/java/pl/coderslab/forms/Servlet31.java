package pl.coderslab.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {


    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
            IOException {


        Double amount = Double.parseDouble(request.getParameter("cash"));
        String exchange = request.getParameter("payment");
        String amountStr = String.valueOf(amount);
        Double amountExchanged = 0.;

        Map<String, Double> map = new HashMap<>();
        map.put("eurNaUsd", 1.10);
        map.put("usdNaEur", 0.91);
        map.put("eurNaPln", 4.30);
        map.put("plnNaEur", 0.23);
        map.put("usdNaPln", 3.90);
        map.put("plnNaUsd", 0.26);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (exchange.equals(entry.getKey())) {
                amountExchanged = entry.getValue() * amount;
            }
        }

        String amountExchangedStr = String.valueOf(amountExchanged);
        String currency = exchange.substring(0, 3).toUpperCase();
        String currencyExchanged = exchange.substring(5, 8).toUpperCase();
        response.getWriter().append(amountStr).append(currency).append(" to ")
                .append(amountExchangedStr).append(currencyExchanged);


    }

}


