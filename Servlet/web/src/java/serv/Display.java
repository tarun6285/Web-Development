
package serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sun.security.action.*;

@WebServlet(name = "Display", urlPatterns = {"/Display"})
public class Display extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = null;
        session = request.getSession();
        try {
            String branch = request.getParameter("empBranch");
            String newName = (String) session.getAttribute("empName");
            out.println("<html>");
            out.println("<head><title>NEW EMPLOYEE</title></head>");
            out.println("<body>");
            out.println("<form action=\"Display\" method =\"GET\">");
            out.println("<table width=\"60%\" align=\"center\" border=\"1\">");
            out.println("<tr align=\"center\"><td>");
            out.println("Name:" + newName + "<br/><br/>");
            out.println("Branch:" + branch + "<br/><br/>");
            out.println(" <input type=\"submit\" value=\"Finish\" name=\"sbtnNextLast\"/>");
            out.println("</td></tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");

            if (request.getParameter("sbtnNext1") != null) {
                session.getAttribute(newName);
                session.setAttribute("empBranch", branch);
                System.out.println("value of new name: " + newName);
                System.out.println("value of new branch: " + branch);
            }
            if (request.getParameter("sbtnNextLast") != null) {
                if (newName != "" && branch != "") {
                    RequestDispatcher rd = null;
                    rd = request.getRequestDispatcher("WelcomeServlet");
                    rd.forward(request, response);
                }
            }

        } finally {
            out.close();
        }
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
