<%-- 
    Document   : View
    Created on : Sep 26, 2012, 12:12:08 PM
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
            String firstName = (String) session.getAttribute("firstName");
            String secondName = (String) session.getAttribute("secondName");
            String thirdName = request.getParameter("txtThirdName");
        %>
        <a href="index.jsp">Home</a>
        <h2>Session Demo</h2>
        <hr>
        <table align="center">
            <tr>
                <td>First Name:</td>
                <td><%=firstName%></td>
            </tr>
            <tr>
                <td>Second Name:</td>
                <td><%=secondName%></td>
            </tr>
            <tr>
                <td>Third Name:</td>
                <td><%=thirdName%></td>
            </tr>
        </table>
    </body>
</html>
