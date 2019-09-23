<%-- 
    Document   : Second
    Created on : Sep 26, 2012, 11:53:29 AM
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
        <form action="Third.jsp" method="POST">
            <h2 align="center">Session Demo</h2>
            <hr/>
            <table align="center">
                <tr>
                    <td>Second Name</td>
                    <td><input type="text" name="txtSecondName"/></td>
                </tr>
                <%
                    if (request.getParameter("txtFirstName") != null) {
                        session.setAttribute("firstName", request.getParameter("txtFirstName"));
                    }
                %>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Next" name="sbtnNext"/>&nbsp;&nbsp;&nbsp;
                        <input type="reset" value="Reset" name="rbtnReset"/>&nbsp;&nbsp;&nbsp;
                        <input type="button" value="Back" name="btnBack" onclick="history.go(-1)"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
