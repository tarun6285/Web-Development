<%-- 
    Document   : ErrorPage
    Created on : Sep 25, 2012, 1:40:59 PM
    Author     : priyanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="index.jsp">Home</a>
        <hr/>
        <h4 align="center">Error Occurred: <%=exception.getMessage()%></h4>
    </body>
</html>
