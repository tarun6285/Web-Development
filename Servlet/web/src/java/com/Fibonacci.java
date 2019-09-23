package com;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Fibonacci", urlPatterns = {"/Fibonacci.in"})
public class Fibonacci extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Prime Numbers</title></head>");
        out.println("<body bgcolor=\"transparent\">");
        out.println("<table width=\"60%\" border=\"0\" bgcolor=\"antiquewhite\" align=\"center\">");
        out.println("<tr><td>Fibonacci Series:</td></tr>");
        int a = 1, b = 0;
        for (int i = 1; i <= 200; i++) {
            while (a <= 200) {
                int c = b;
                b = b + a;
                a = c;
                out.println("<tr><td>" + a + "</td></tr>");
            }
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
