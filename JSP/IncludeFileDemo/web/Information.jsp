<%-- 
    Document   : Information
    Created on : Sep 26, 2012, 10:34:15 AM
    Author     : priyanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="CheckSession.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="view.jsp" method="POST">
            <h2 align="center">Include File Demo</h2>
            <hr/>
            <table align="center" border="1" rules="none">
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="txtName"/></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><input type="text" name="txtAge"/></td>
                </tr>
                <tr>
                    <td>Gender:&nbsp;&nbsp;</td>
                    <td>Male<input type="radio" name="rbtnGender" value="Male"/>
                        Female<input type="radio" name="rbtnGender" value="Female"/></td>
                </tr>
                <tr>
                    <td>Course:</td>
                    <td>
                        Core Java<input type="checkbox" name="chk" value="Core Java"/>
                        Advance Java<input type="checkbox" name="chk" value="Advance Java"/>
                    </td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><textarea name="taAddress" rows="4" cols="20"></textarea></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Submit" name="btnSubmit"/>
                        <input type="reset" value="Reset" name="btnReset"/>
                        <input type="button" value="Logout" name="btnLogout" onclick="window.location='Logout.jsp'"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
