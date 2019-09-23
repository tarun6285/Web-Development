<%-- 
    Document   : index
    Created on : Sep 25, 2012, 12:47:34 PM
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
        <form action="AuthenticationServlet" method="POST">
            <h2 align ="center">Authentication Demo</h2>
            <hr/>
            <center>
                <fieldset style="width: 250px;">
                    <legend>LogIn</legend>
                    <table align="center">
                        <caption>
                            <%
                                if (request.getParameter("msg") != null) {
                                    String msg = request.getParameter("msg");
                            %>
                            <label style="color: red"><%= msg%></label>
                            <%
                                }
                            %>
                        </caption>
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
