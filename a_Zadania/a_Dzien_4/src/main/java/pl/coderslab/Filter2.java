package pl.coderslab;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Filter2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        final HttpServletRequest httpRequest = (HttpServletRequest) request;
        System.out.println(httpRequest.getHeader("User-agent"));

        long startTime = System.currentTimeMillis();
        chain.doFilter(request, response);
        long stopTime = System.currentTimeMillis();
        System.out.println("czas wykonania: " + (stopTime - startTime) + " ms");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
