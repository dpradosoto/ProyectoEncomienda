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

import Modelo.Encomienda;



/**
 *
 * @author Darto
 */
public class EncomiendaDAO {

    private Connection connection;

    public EncomiendaDAO() {
     

    }


    public void addEncomienda(Encomienda encomienda) {

        try {
            // Llenado de Tablas encomienda
            conexion con = new conexion();

        connection = con.conexion();
           
            String query = "insert into encomienda (  TipoEncomienda, Peso, Largo, Alto, Ancho, Nreceptor)values ( '" + encomienda.getTipoEncomienda() + "', '" + encomienda.getPeso() + "','" + encomienda.getLargo() + "','" + encomienda.getAlto() + "','" + encomienda.getAncho() + "','" + encomienda.getNreceptor() + "')";

           
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
