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


import Modelo.Recorrido;



/**
 *
 * @author Darto
 */
public class RecorridoDAO {
    
     private Connection connection;
    
      public void addEncomienda( Recorrido recorrido) {

        try {
            // Llegano de Tablas encomienda, recorrido y mediopago
      
            String query1 = "insert into recorrido (  Llegada, Salida, DireccionRetiro, DireccionEnvio)values ('" + recorrido.getLlegada() + "', '" + recorrido.getSalida() + "','" + recorrido.getRetiro() + "','" + recorrido.getEnvio() + "')";

          
            Statement stmt = connection.createStatement();
       
            stmt.executeUpdate(query1);
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    
    
    
}
