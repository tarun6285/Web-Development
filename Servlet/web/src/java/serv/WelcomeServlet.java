
package serv;

import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "WelcomeServlet", urlPatterns = {"/WelcomeServlet"})
public class WelcomeServlet extends HttpServlet {

    int start = 0, total = 5;
    Connection conn = null;

    public void init(ServletConfig config) throws ServletException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db8", "root", "");

        } catch (Exception e) {
            System.out.println("Error in getConnenction" + e);
        }

    }

    public void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            if (request.getParameter("n1") != null) {
                start = Integer.parseInt(request.getParameter("n1"));
            }
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HomePage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table width=\"60%\" border=\"1\" align=\"center\">");
            out.println("<tr><td><font size=\"6\" color=\"purple\"><b><center>EMPLOYEE DETAILS</center></b></font></td></tr>");
            out.println("<tr>");
            out.println("<td align=\"center\"><a href=\"AddNew\">ADD</a></td>");
            out.println("</tr>");
            out.println("<tr><td>");
            out.println("<table width=\"100%\" border=\"1\" align=\"center\">");
            out.println("<tr align=\"center\">");
            out.println("<th>ID</th>");
            out.println("<th>Name</th>");
            out.println("<th>Branch</th>");
            out.println("</tr>");
            ResultSet rs = getRecords(start, total);
            while (rs.next()) {
                out.println("<tr align=\"center\">");
                out.println("<td>" + rs.getInt("ID") + "</td>");
                out.println("<td>" + rs.getString("Name") + "</td>");
                out.println("<td>" + rs.getString("Branch") + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<table align=\"center\">");
            out.println("<tr align=\"center\">");
            for (int a = 0; a < countLinks(); a++) {
                out.println("<th><a href=\"WelcomeServlet?n1=" + (total * a) + "&n2=" + total + "\">" + (a + 1) + "</a></th>");
            }
            out.println("</tr>");
            out.println("</table>");
            out.println("</td></tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            System.out.println("Exception in process request is: " + e);
        } finally {
            out.close();
        }
    }

    ResultSet getRecords(int s, int t) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement("select * from emp limit ?,?");
            pstmt.setInt(1, s);
            pstmt.setInt(2, t);
            rs = pstmt.executeQuery();

        } catch (Exception e) {
            System.out.println("Exception in getRecords is: " + e);
        }
        return rs;
    }

    int countLinks() {
        int link = 0;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) as 'total' from Emp;");
            if (rs.next()) {
                int l = rs.getInt("total") / total;
                int rem = rs.getInt("total") % total;
                link = (rem == 0) ? l : (l + 1);
            }

        } catch (Exception e) {
            System.out.println("Exception in count links is :" + e);

        }
        return link;
    }
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
