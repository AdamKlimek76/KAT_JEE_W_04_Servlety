package pl.coderslab.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/servlet352")
public class Servlet352 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<CartItem> cartItems = (List) session.getAttribute("basket");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }
        Double sum = 0.00;
        Double kwota = 0.00;
        for (int i = 0; i < cartItems.size(); i++) {
            kwota = cartItems.get(i).getQuantity() * cartItems.get(i).getPrice();
            response.getWriter().println(cartItems.get(i).getName() +
                    " - " + cartItems.get(i).getQuantity() +
                    " x " + cartItems.get(i).getPrice() +
                    " = " + kwota + " PLN.");
            sum += kwota;
        }
        response.getWriter().println("Suma: " + sum + " PLN.");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
