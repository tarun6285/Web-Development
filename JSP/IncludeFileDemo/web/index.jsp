<%-- 
    Document   : index
    Created on : Sep 26, 2012, 10:18:04 AM
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
        <form name="frmAuthenticate" action="Authenticate.jsp" method="POST">
            <h2 align="center">Include File Demo</h2>
            <hr/>
            <center>
                <fieldset style="width: 220px">
                    <legend>Login</legend>
                    <table align="center">
                        <tr>
                            <td colspan="2">
                                <%

                                    if (request.getParameter("msg") != null) {
                                        String msg = request.getParameter("msg");
                                %>
                        <lable style="color: red"><%=msg%></lable> 
                        <%
                            }
                        %>
                        </td>
                        </tr>
                        <tr>
                            <td>Username</td>
                            <td><input type="text" name ="txtUserName"/></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name ="txtPassword"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value ="Login" name="sbtnLogin"/>
                                <input type="reset" value ="Reset" name="sbtnReset"/></td>
                        </tr>
                    </table>
                </fieldset>
            </center>
        </form>
    </body>
</html>
