<%-- 
    Document   : Authenticate
    Created on : Sep 26, 2012, 10:28:47 AM
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
            String un = request.getParameter("txtUserName");
            String pw = request.getParameter("txtPassword");
            if (un.equals("admin") && pw.equals("admin")) {
                session.setAttribute("username", request.getParameter("txtUserName"));
                response.sendRedirect("Information.jsp");
            } 
            else {
                response.sendRedirect("index.jsp?msg=Invalid username and password");
            }

        %>
    </body>
</html>
