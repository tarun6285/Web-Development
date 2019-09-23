<%-- 
    Document   : Welcome
    Created on : Sep 26, 2012, 11:25:02 AM
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
        <a href="index.jsp">Home<hr/></a>
            <%
                if (request.getParameter("msg") != null) {
                    String msg= request.getParameter("msg");
            %>
        <h4 align="center"><%=msg%></h4>
        <%
               }
        %>
    </body>
</html>
