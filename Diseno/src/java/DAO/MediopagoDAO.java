/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import Modelo.Mediopago;


/**
 *
 * @author Darto
 */
public class MediopagoDAO {
    
    
    public MediopagoDAO() {
     

    }
    
    
     private Connection connection;
    
      public void addMediopago( Mediopago mediopago) {

        try {
            
             conexion con = new conexion();

        connection = con.conexion();
            // Llegano de Tabla mediopago
     
            String query2 = "insert into mediopago (  Efectivo, TarjetaCredito, TarjetaDebito)values ('" + mediopago.getEfectivo() + "', '" + mediopago.getTarjetaCredito() + "','" + mediopago.getTarjetaDebito() + "')";

            Statement stmt = connection.createStatement();
       
            stmt.executeUpdate(query2);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    
    
}
