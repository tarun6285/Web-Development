<%-- 
    Document   : index
    Created on : Sep 25, 2012, 1:29:31 PM
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
        <form action="Division.jsp">
            <h2 align="center">Error Page Demo</h2>
            <hr/>
            <table align="center">
                <tr>
                    <td>First Number:</td>
                    <td><input type="text" name="txtFirstNumber"/></td>
                </tr>
                <tr>
                    <td>Second Number:</td>
                    <td><input type="text" name="txtSecondNumber"/></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Division" name="btnAdd"/>
                        <input type="reset" value="Reset" name="btnReset"/>
                    </td>
                </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
