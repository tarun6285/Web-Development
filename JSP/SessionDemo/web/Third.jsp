<%-- 
    Document   : Third
    Created on : Sep 26, 2012, 12:03:46 PM
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
        <form action="View.jsp" method="POST">
            <h2 align="center">Session Demo</h2>
            <hr>
            <table align="center">
                <tr>
                    <td>Third Name</td>
                    <td><input type="text" name="txtThirdName"/></td>
                </tr>
                <%
                    if (request.getParameter("txtSecondName") != null) {
                        session.setAttribute("secondName", request.getParameter("txtSecondName"));
                    }
                %>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Submit" name="sbtnNext"/>&nbsp;&nbsp;&nbsp;
                        <input type="reset" value="Reset" name="rbtnReset"/>&nbsp;&nbsp;&nbsp;
                        <input type="button" value="Back" name="btnBack" onclick="history.go(-1)"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
