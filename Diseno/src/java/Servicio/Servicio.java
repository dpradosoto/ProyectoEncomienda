/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import DAO.EncomiendaDAO;
import DAO.MediopagoDAO;
import DAO.RecorridoDAO;
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


@WebServlet(name = "Servicio", urlPatterns = {"/Servicio"})
public class Servicio extends HttpServlet {
    
    private static long serialVersionUID = 1L;
    
    EncomiendaDAO encomiendadao;
    MediopagoDAO mediopagodao;
    RecorridoDAO recorridodao;
    
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
        
        
        encom.setIdEncomienda(0);
        //000000000000000
        
        encom.setTipoEncomienda(request.getParameter("Tipo"));
        encom.setLargo(request.getParameter("largo"));
        encom.setAlto(request.getParameter("alto"));
        encom.setAncho(request.getParameter("ancho"));
        encom.setPeso(request.getParameter("peso"));
        encom.setDescripcion(request.getParameter("Receptor"));
        reco.setRetiro(request.getParameter("Dretiro"));
        reco.setLlegada(request.getParameter("Denvio"));
        
         String test=null;
        if ("Efectivo".equals(request.getParameter("pago"))) {
            
            mpag.setEfectivo(request.getParameter("pago"));
            
        } else if ("Tarjeta Credito".equals(request.getParameter("pago"))) {
            
            mpag.setTarjetaCredito(request.getParameter("pago"));
            
           test= request.getParameter("pago");
            
        } else if ("Tarjeta Debito".equals(request.getParameter("pago"))) {
            
            mpag.setTarjetaDebito(request.getParameter("pago"));
            
        }
        
        String action = request.getParameter("enviar");
        
        String test1 = request.getParameter("Tipo");
         String test2 =request.getParameter("largo");
         String test3 = request.getParameter("alto");
         String test4 = request.getParameter("ancho");
        String test5 =  request.getParameter("peso");
          String test6 =  request.getParameter("Receptor");
        String test7 =  request.getParameter("Dretiro");
        String test8 =  request.getParameter("Denvio");
        
        System.out.println("--"+test+"--"+test1+"--"+test2+"--"+test3+"--"+test4+"--"+test5+"--"+test6+"--"+test7+"--"+test8+"--");
        
        
                
                
        try {
            
            //encomiendadao.addEncomienda(encom);
            encomiendadao.addEncomienda(test1, test5, test2,test3, test4, test6);
            
            mediopagodao.addEncomienda(mpag);
            recorridodao.addEncomienda(reco);
            
            
            
            
            
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
