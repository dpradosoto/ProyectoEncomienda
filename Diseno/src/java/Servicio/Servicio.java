/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import DAO.EncomiendaDAO;
import Modelo.Encomienda;
import Modelo.Mediopago;
import Modelo.Recorrido;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Darto
 */
@WebServlet(name = "Servicio", urlPatterns = {"/Servicio"})
public class Servicio extends HttpServlet {
    
    private static long serialVersionUID = 1L;
    EncomiendaDAO encomiendadao;
    
    private static String edit_or_add = "/encomienda.jsp";
    
    private static String menu = "/index.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Encomienda encom = new Encomienda();
        Recorrido reco = new Recorrido();
        Mediopago mpag = new Mediopago();
        
        encom.setTipoEncomienda(request.getParameter("Tipo"));
        encom.setLargo(request.getParameter("largo"));
        encom.setAlto(request.getParameter("alto"));
        encom.setAncho(request.getParameter("ancho"));
        encom.setPeso(request.getParameter("peso"));
        encom.setDescripcion(request.getParameter("Receptor"));
        reco.setRetiro(request.getParameter("Dretiro"));
        reco.setLlegada(request.getParameter("Denvio"));
        
        if ("Efectivo".equals(request.getParameter("pago"))) {
            
            mpag.setEfectivo(request.getParameter("pago"));
            
        } else if ("Tarjeta Credito".equals(request.getParameter("pago"))) {
            
            mpag.setTarjetaCredito(request.getParameter("pago"));
            
        } else if ("Tarjeta Debito".equals(request.getParameter("pago"))) {
            
            mpag.setTarjetaDebito(request.getParameter("pago"));
            
        }
        
        String action = request.getParameter("enviar");
        
        try {
            
            encomiendadao.addEncomienda(encom, reco, mpag);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        response.sendRedirect("encomienda.jsp");        
        
        response.setContentType("text/html;charset=UTF-8");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
