/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.models.DemandeEvenement;

/**
 *
 * @author lenovo
 */

@WebServlet(urlPatterns = {"/ModifierDemande"})
public class ModifierDemande extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           {
         /* Recuperation des valeurs des champs du page Form_reserver.jsp */
            //Personnes client=new Personnes();
           
            DemandeEvenement demande = new DemandeEvenement() ;
            demande.setIdDemande(Integer.parseInt(request.getParameter("idDemande")));
            demande.setDateDebutEvent(request.getParameter("dateDebut"));
            demande.setHeureDebutEvent(request.getParameter("heureDebut"));
            demande.setLieuEvent("lieu");
            demande.setHeureFinEvent(request.getParameter("heureFin"));
            demande.setNbrInvite(Integer.parseInt(request.getParameter("nbrInvite")));
            demande.setIdAnimation(Integer.parseInt(request.getParameter("animation")));
            demande.setIdMenu(Integer.parseInt(request.getParameter("menu")));
            demande.setIdDecoration(Integer.parseInt(request.getParameter("decoration")));


            //-----------------------------------------   Recuperer id du client depuis la session  --------------------------------------
            
          
            
/* *******************************    FIN DE RECUPERATION         *********************************************     */

MyDb db = new MyDb();
Connection con = db.getCon();
try {

PreparedStatement pst = con.prepareStatement("UPDATE demandeevenement SET dateDebutEvent=?,heureDebutEvent=?,heureFinEvent=?,LieuEvent=?,NbrInvite=?,idAnimation=?,idDecoration=?,idMenu=? WHERE idDemande=?;");

 pst.setString(1, demande.getDateDebutEvent());
 pst.setString(2, demande.getHeureDebutEvent());
 pst.setString(3, demande.getHeureFinEvent());
  pst.setString(4, demande.getLieuEvent());
 pst.setInt(5, demande.getNbrInvite());
 pst.setInt(6,demande.getIdAnimation());
 pst.setInt(7,demande.getIdDecoration());
 pst.setInt(8,demande.getIdMenu());
 pst.setInt(9,demande.getIdDemande());
  
 pst.executeUpdate();

//response.sendRedirect("reservation.jsp"); //************* envoyer l'utilisateur si c'est un client vers son MENU 
}catch (SQLException e) {
out.println(e.getMessage());
         
}
response.sendRedirect("reservation.jsp");

    }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
