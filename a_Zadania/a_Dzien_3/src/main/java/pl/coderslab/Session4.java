package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session4")
public class Session4 extends HttpServlet {

    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
            IOException {
        HttpSession session = request.getSession();
        CartItem cartItem = getCartItem(request);
        List<CartItem> cartItems = getCartItems(session, cartItem);
        session.setAttribute("atrybut", cartItems);
        Double sum = 0.00;
        Double kwota = 0.00;
        //getServletContext().getRequestDispatcher("/session4.html")
         //       .forward(request, response);
        for (int i = 0; i < cartItems.size(); i++) {
            kwota = cartItems.get(i).getIlosc() * cartItems.get(i).getCena();
            response.getWriter().println(cartItems.get(i).getNazwa() +
                    " - " + cartItems.get(i).getIlosc() +
                    " x " + cartItems.get(i).getCena() +
                    " = " + kwota + " PLN.");
            sum += kwota;
        }
        response.getWriter().println("Suma: " + sum + " PLN.");

    }

    private List<CartItem> getCartItems(HttpSession session, CartItem cartItem) {
        List<CartItem> cartItems = (List) session.getAttribute("atrybut");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }
        cartItems.add(cartItem);
        return cartItems;
    }

    private CartItem getCartItem(HttpServletRequest request) {
        String nazwa = request.getParameter("nazwa");
        Integer ilosc = Integer.parseInt(request.getParameter("ilosc"));
        Double cena = Double.parseDouble(request.getParameter("cena"));
        return new CartItem(nazwa, ilosc, cena);
    }
}
