<%-- 
    Document   : index
    Created on : Sep 26, 2012, 11:47:08 AM
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
        <form action="Second.jsp" method="POST">
            <h2 align="center">Session Demo</h2>
            <hr/>
            <table align="center">
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="txtFirstName"/></td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit" value="Next" name="sbtnNext"/>
                        <input type="reset" value="Reset" name="rbtnreset"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
