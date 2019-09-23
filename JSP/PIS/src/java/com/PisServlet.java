/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author priyanka
 */
@WebServlet(name = "PisServlet", urlPatterns = {"/PisServlet"})
public class PisServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           out.println("<html>");
           out.println("<body bgcolo=\"#C2DFF5\">");
           out.println("<a href=\"index.jsp\">Home</a>");
           out.println("<h2><center>JSP to Servlet Demo</center></h2>");        
           out.println("<hr></hr>");
           out.println("<h3>Personal Information</h3>");
           out.println("Name :"+request.getParameter("txtName")+"<br/>");
           out.println("Age :"+request.getParameter("txtAge")+"<br/>");
           out.println("Gender :"+request.getParameter("rbtnGender")+"<br/>");
          String[] s= request.getParameterValues("chk");
          out.println("Course :");
          for(int i=0;i<s.length;i++)
          {
              out.println(s[i]);
          }
          out.println("</br>");
          out.println("Address :"+request.getParameter("taAddress")+"<br/>");
          out.println("</body>");
          out.println("</html>");
           
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
