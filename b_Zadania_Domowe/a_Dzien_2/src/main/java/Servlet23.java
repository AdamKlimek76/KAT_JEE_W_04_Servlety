import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "Servlet23", urlPatterns = "/servlet23")
public class Servlet23 extends HttpServlet {

    //Testowałem różne rozwiązania i nie widzi pliku oop.txt.
    //Taki sam zapis w klasie ApacheAttempt i tam działa. Dlaczego?????!!!!!
    private static final String FILE_OOP_PATH = "b_Zadania_Domowe/a_Dzien_2/oop.txt";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        File exampleFile = FileUtils.getFile(FILE_OOP_PATH);
        List<String> oopList = new ArrayList<>();

        LineIterator iter = FileUtils.lineIterator(exampleFile);
        while (iter.hasNext()) {
            String strLine = iter.nextLine();
            oopList.add(strLine);
            response.getWriter().println(strLine);
        }
        iter.close();

        //Testy
        String str = oopList.toString();
        response.getWriter().println(str);
        response.getWriter().println("Druga linia");
        String string = "Trzecia linia";
        response.getWriter().println(string);
        response.getWriter().append("Piąta linia ").append("Szósta linia");

        for (int i = 0; i < oopList.size(); i++) {
            response.getWriter().println(oopList.get(i));
        }

    }

}
