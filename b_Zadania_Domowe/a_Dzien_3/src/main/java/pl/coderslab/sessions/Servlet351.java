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

@WebServlet("/servlet351")
public class Servlet351 extends HttpServlet {
    final private static String FORM = "<!DOCTYPE html>\n" +
            "<html lang=\"pl\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<form action=\"servlet351\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Nazwa:\n" +
            "        <input type=\"text\" name=\"name\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Ilosc:\n" +
            "        <input type=\"number\" name=\"quantity\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Cena:\n" +
            "        <input type=\"number\" step=\"0.01\" name=\"price\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\" value=\"addproduct\">\n" +
            "</form><br>\n" +
            "<form action=\"servlet352\" method=\"POST\">\n" +
            "    <input type=\"submit\" value=\"showbasket\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";
    final private static String FORM_BEFORE = "<!DOCTYPE html>\n" +
            "<html lang=\"pl\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "</head>\n" +
            "<body>";
    final private static String FORM_AFTER = "<form action=\"servlet351\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Nazwa:\n" +
            "        <input type=\"text\" name=\"name\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Ilosc:\n" +
            "        <input type=\"number\" name=\"quantity\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Cena:\n" +
            "        <input type=\"number\" step=\"0.01\" name=\"price\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\" value=\"addproduct\">\n" +
            "</form><br>\n" +
            "<form action=\"servlet352\" method=\"POST\">\n" +
            "    <input type=\"submit\" value=\"showbasket\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";


    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
            IOException {
        HttpSession session = request.getSession();
        CartItem cartItem = readCartItem(request);
        List<CartItem> cartItems = readCartItems(session, cartItem);
        session.setAttribute("basket", cartItems);
        String action = request.getParameter("basketaction");
            response.getWriter().append(FORM_BEFORE).append("Produkt dodany. Dodaj nowy produkt:").append(FORM_AFTER);
    }

    private List<CartItem> readCartItems(HttpSession session, CartItem cartItem) {
        List<CartItem> cartItems = (List) session.getAttribute("basket");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
        }
        cartItems.add(cartItem);
        return cartItems;
    }

    private CartItem readCartItem(HttpServletRequest request) {
        String name = request.getParameter("name");
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        Double price = Double.parseDouble(request.getParameter("price"));
        return new CartItem(name, quantity, price);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(FORM);
    }
}
