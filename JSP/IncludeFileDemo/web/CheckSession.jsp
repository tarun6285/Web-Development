<%-- 
    Document   : CheckSession
    Created on : Sep 26, 2012, 10:55:27 AM
    Author     : priyanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          response.setHeader("Cache-Control", "no-cache");
          response.setHeader("Cache-Control","no-store");
          response.setHeader("Pragma", "no-store");
          response.setDateHeader("Expire",0);
          if(session.getAttribute("username")== null)
          {
              response.sendRedirect("index,jsp");
          }
        %>
    </body>
</html>
