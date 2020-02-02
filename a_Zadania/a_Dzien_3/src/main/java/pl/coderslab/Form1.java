package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post1")
public class Form1 extends HttpServlet {

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            final String imie = request.getParameter("imie");
            final String nazwisko = request.getParameter("nazwisko");

            response.getWriter().println("Witaj, " + imie + " " + nazwisko);
        }


    }


