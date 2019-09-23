package com;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "MissingDigit", urlPatterns = {"/MissingDigit.in"})
public class MissingDigit extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Missing Digit/s</title></head>");
        out.println("<body  bgcolor=\"transparent\">");
        out.println("<table width=\"60%\" border=\"0\" bgcolor=\"antiquewhite\" align=\"center\">");
        out.println("<tr><td>The missing digits are</td></tr>");
        int n=16976789;
        int slot= n;
        for(int i=0;i<=9;i++)
        {
            int temp=0;
            
            while(n>0)
            {
                int r =n%10;
                if(r == i)
            {
                
                temp=1;
            }
                n= n-r;
                n=n/10;
           }
            if(temp==0)
            {
                out.println("<tr><td>"+i+"</td></tr>");
            }
           n=slot;
            
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
