
package serv;

import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "HomePage", urlPatterns = {"/HomePage"})

public class HomePage extends HttpServlet {

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

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        int flag = 0;
       
        try {
            System.out.println("Servlet" + request.getParameter("sbtnLogin"));
            if (request.getParameter("sbtnLogin")!= null) {
                String name = request.getParameter("txtName");
                String password = request.getParameter("txtPassword");

                if (name.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
                    session.setAttribute(name, "admin");
                    session.setAttribute(password, "admin");
                    flag = 1;
                }
                
                if (flag == 1) {
                    RequestDispatcher rd = null;
                    rd = request.getRequestDispatcher("WelcomeServlet");
                    rd.forward(request, response);
                   
                } else {
                    out.println("<center><font color=\"red\"><u><b>ERROR:Kindly enter a valid username or password</b></u></font></center>");
                    RequestDispatcher rd = null;
                    rd = request.getRequestDispatcher("Welcome.html");
                    rd.include(request, response);
                }
            }
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
