<%-- 
    Document   : Control
    Created on : Sep 26, 2012, 11:27:53 AM
    Author     : priyanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="datalayer.Authenticate" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (!request.getParameter("txtUserName").equals("") && !request.getParameter("txtPassword").equals("")) {

        %>
        <jsp:useBean id="objLogin" class="bean.LoginBean">
            <jsp:setProperty name="objLogin" property="*"/>
        </jsp:useBean>
        <%
            Authenticate obj = new Authenticate();
            String result = obj.checkUser(objLogin);
            if (result.equals("valid")) {
        %>
        <jsp:forward page="Welcome.jsp">
            <jsp:param name="msg" value="Password Accepted"/>
        </jsp:forward>
        <%        } else {
        %>
        <jsp:include page="index.jsp">
            <jsp:param name="msg" value="invalid username or password"/>
        </jsp:include>
        <%            }
        } else {
        %>
        <jsp:include page="index.jsp">
            <jsp:param name="msg" value="invalid username or password"/>
        </jsp:include>
        <%            }
        %>
        
    </body>
</html>
