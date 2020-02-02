package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post4")
public class Form4 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Integer a = Integer.parseInt(request.getParameter("a"));
        final Integer b = Integer.parseInt(request.getParameter("b"));
        final Integer c = Integer.parseInt(request.getParameter("c"));
        final Integer Delta = b*b-(4*a*c);
        if (Delta<0){
            response.getWriter().println("Brak miejsc zerowych");
        }else if(Delta==0){
            response.getWriter().println("Jedno miejsce zerowe");
        }else{
            response.getWriter().println("Dwa miejsca zerowe");
        }

    }

}
