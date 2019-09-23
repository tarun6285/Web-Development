<%-- 
    Document   : Division
    Created on : Sep 25, 2012, 1:36:07 PM
    Author     : priyanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="ErrorPage.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="index.jsp">Home</a>
        <hr/>
        <%
            int a = Integer.parseInt(request.getParameter("txtFirstNumber"));
             int b = Integer.parseInt(request.getParameter("txtSecondNumber"));
             int c = a/b;
        %>
        <h4 align="center">Result:<%=c%></h4>
    </body>
</html>
