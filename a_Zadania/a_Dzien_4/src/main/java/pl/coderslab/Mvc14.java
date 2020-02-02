package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books=new ArrayList<>();
        books.add(new Book("Tytul1", "Autor1", 123));
        books.add(new Book("Tytul2", "Autor2", 234));
        books.add(new Book("Tytul3", "Autor3", 345));
        books.add(new Book("Tytul4", "Autor4", 456));
        books.add(new Book("Tytul5", "Autor5", 567));

        request.setAttribute("books", books);

        getServletContext().getRequestDispatcher("/resultList.jsp")
                .forward(request, response);
    }
}
