<%-- 
    Document   : Welcome
    Created on : Sep 25, 2012, 1:20:24 PM
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
        <a href="index.jsp">Home</a>
        <h2 align="center" >Authentication Demo</h2>
        <hr/>
        <%
        String msg = "";
        if(request.getParameter("msg")!= null);
               {
                    msg = request.getParameter("msg");
               }
        %>
        <h4 align="center"><%= msg%></h4>
    </body>
</html>
