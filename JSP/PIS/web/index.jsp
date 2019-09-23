<%-- 
    Document   : index
    Created on : Sep 25, 2012, 12:20:17 PM
    Author     : priyanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolo="#C2DFF5">
        <form name ="FrmIndex" action ="PisServlet" method="POST"> 
            <h2>JSP Servlet DEMO</h2>
            <hr></hr>
            <center>
                <fieldset style="width: 350px">
                    <legend>Information form</legend>
                    <table border="0" align="center">
                        <tr>
                            <td>Name:</td>
                            <td><input type="text" name="txtName" size="10"/></td>
                        </tr>
                        <tr>
                            <td>Age:</td>
                            <td><input type="text" name="txtAge" size="3"/></td>
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
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </center>
        </form>
    </body>
</html>
