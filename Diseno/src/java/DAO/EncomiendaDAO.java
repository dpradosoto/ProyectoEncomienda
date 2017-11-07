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
import Modelo.Recorrido;
import Modelo.Mediopago;

/**
 *
 * @author Darto
 */
public class EncomiendaDAO {

    private Connection connection;

    public EncomiendaDAO() throws ClassNotFoundException {
        conexion con = new conexion();

        connection = con.conexion();

    }

    public void addEncomienda(Encomienda encomienda, Recorrido recorrido, Mediopago mediopago) {

        try {
            // Llegano de Tablas encomienda, recorrido y mediopago
            String query = "insert into encomienda (  TipoEncomienda, Peso, Largo, Alto, Ancho, Descripcion)values ( '" + encomienda.getTipoEncomienda() + "', '" + encomienda.getPeso() + "','" + encomienda.getLargo() + "','" + encomienda.getAlto() + "','" + encomienda.getAncho() + "','" + encomienda.getDescripcion() + "')";

            String query1 = "insert into recorrido (  Llegada, Salida, DireccionRetiro, DireccionEnvio)values ('" + recorrido.getLlegada() + "', '" + recorrido.getSalida() + "','" + recorrido.getRetiro() + "','" + recorrido.getEnvio() + "')";

            String query2 = "insert into mediopago (  Efectivo, TarjetaCredito, TarjetaDebito)values ('" + mediopago.getEfectivo() + "', '" + mediopago.getTarjetaCredito() + "','" + mediopago.getTarjetaDebito() + "')";

            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
