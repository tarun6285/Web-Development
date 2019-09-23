package com;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Prog01", urlPatterns = {"/PrimeNumbers.in"})
public class Prime extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Prime Numbers</title></head>");
        out.println("<body bgcolor=\"transparent\">");
        out.println("<table width=\"60%\" border=\"1\" bgcolor=\"antiquewhite\" align=\"center\">");
        out.println("<tr><td>Prime Numbers between 1 & 200 are given below</td></tr>");

        for (int a = 2; a <= 200; a++) {
            int flag = 0;
            for (int num = 2; num <= a / 2; num++) 
            {
                if (a%num == 0) 
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                out.println("<tr><td>" + a + "</td></tr>");
            }
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
