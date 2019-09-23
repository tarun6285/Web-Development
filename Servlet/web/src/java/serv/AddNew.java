
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

@WebServlet(name = "AddNewEmployee", urlPatterns = {"/AddNew"})
public class AddNew extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = null;
        session = request.getSession();
        try {
            out.println("<html>");
            out.println("<head><title>NEW EMPLOYEE</title></head>");
            out.println("<body>");
            out.println("<form action=\"AddNew\" method =\"GET\">");
            out.println("<table width=\"60%\" align=\"center\" border=\"1\">");
            out.println("<tr align=\"center\"><td>");
            out.println(" Name:   <input type=\"text\" name=\"empName\" /><br/><br/>");
            out.println(" <input type=\"submit\" value=\"Next\" name=\"sbtnNext\"/>");
            out.println("</td></tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            String newName1 = request.getParameter("empName");
            if (request.getParameter("sbtnNext") != null) {
                if (!newName1.equals("")) {
                    RequestDispatcher rd = null;
                    rd = request.getRequestDispatcher("NewBranch");
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
