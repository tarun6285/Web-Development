<%-- 
    Document   : index
    Created on : Sep 26, 2012, 11:04:00 AM
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
        <form name="frmAuthenticate" action="Control.jsp" method="POST">
            <h2 align="center">USER BEAN DEMO</h2>
            <hr/>
            <center>
                <fieldset style="width: 250px">
                    <legend>Login</legend>
                    <table border="0" bgcolor="cyan" align="center">
                        <%
                            if (request.getParameter("msg") != null) {
                                String msg = request.getParameter("msg");
                        %>
                        <caption><lable style="color:red"><%=msg%></lable></caption>
                        <%
                            }
                        %>
                        <tr>
                            <td>Username</td>
                            <td><input type="text" name="txtUserName"/></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="txtPassword"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="Login" name="sbtnLogin"/>
                                <input type="reset" value="Reset" name="rbtnReset"/>
                            </td>                                
                        </tr>
                    </table>
                </fieldset>
            </center>
        </form>
    </body>
</html>
