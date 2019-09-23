package com;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Reverse", urlPatterns = {"/Reverse.in"})
public class Reverse extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Reverse Numbers</title></head>");
        out.println("<body bgcolor=\"transparent\">");
        out.println("<table width=\"60%\" border=\"1\" bgcolor=\"antiquewhite\" align=\"center\">");
        int num = 54156678, rev = 0;
        while (num != 0) {
            rev = rev * 10;
            rev = rev + (num % 10);
            num = num / 10;
        }
        out.println("<tr><td>Reversed Number is:</td>");
        out.println("<td>" + rev + "</td></tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
