
package com;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="S1",urlPatterns={"/S1"})
public class S1 extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        out.println("<html>");
        out.println("<head><title>My First Servlet</title></head>");
        out.println("<body bgcolor=\"yellow\">");
        out.println("<h1>Table of 3</h1>");
        out.println("<table border=\"1\">");
        for(int a=1;a<=10;a++)
        {
            out.println("<tr><td>"+a+"*3 ="+a*3+"</td></tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
                
    }
}
