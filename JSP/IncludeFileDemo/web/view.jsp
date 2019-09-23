<%-- 
    Document   : view
    Created on : Sep 26, 2012, 10:42:30 AM
    Author     : priyanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="CheckSession.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 align="center">Include File Demo</h2>
        <hr/>
        <table border="1" width="250" rules="none" align="center">
            <tbody>
                <tr>
                    <td>Name:</td>
                    <td><%=request.getParameter("txtName")%></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><%=request.getParameter("txtAge")%></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td><%=request.getParameter("rbtnGender")%></td>
                </tr>
                <tr>
                    <td>Course:</td>
                    <%
                        if (request.getParameterValues("chk") != null) {
                            String s[] = request.getParameterValues("chk");
                            for (int i = 0; i < s.length; i++) {
                    %>
                    <td><%=s[i]%></td>
                    <%
                            }
                        }
                    %>
                </tr>
                 <tr>
                    <td>Address:</td>
                    <td><%=request.getParameter("taAddress")%></td>
                </tr>
                <tr>
                    <td  align="center" colspan="2">
                        <input type="button" value="Back" name="btnBack" onclick="history.go(-1)"/>
                        <input type="button" value="Logout" name="btnLogout" onclick="window.location='Logout.jsp'"/>
                    </td>
                </tr>
        </table>
    </body>
</html>
