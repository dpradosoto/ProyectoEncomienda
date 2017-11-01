/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Felipe
 */
@Entity
@Table(name = "servicio")
@NamedQueries({
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s")})
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "IdServicio")
    private String idServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_Rut")
    private int clienteRut;
    @JoinTable(name = "cliente", joinColumns = {
        @JoinColumn(name = "Servicio_IdServicio", referencedColumnName = "IdServicio")}, inverseJoinColumns = {
        @JoinColumn(name = "persona_Rut", referencedColumnName = "Rut")})
    @ManyToMany
    private Collection<Persona> personaCollection;
    @JoinTable(name = "administrador", joinColumns = {
        @JoinColumn(name = "Servicio_IdServicio", referencedColumnName = "IdServicio")}, inverseJoinColumns = {
        @JoinColumn(name = "persona_Rut", referencedColumnName = "Rut")})
    @ManyToMany
    private Collection<Persona> personaCollection1;
    @JoinColumn(name = "Encomienda_idEncomienda", referencedColumnName = "idEncomienda")
    @ManyToOne(optional = false)
    private Encomienda encomiendaidEncomienda;
    @JoinColumn(name = "mediopago_idMedioPago", referencedColumnName = "idMedioPago")
    @ManyToOne(optional = false)
    private Mediopago mediopagoidMedioPago;
    @JoinColumn(name = "recorrido_idRecorrido", referencedColumnName = "idRecorrido")
    @ManyToOne(optional = false)
    private Recorrido recorridoidRecorrido;
    @JoinColumn(name = "vehiculo_idVehiculo", referencedColumnName = "idVehiculo")
    @ManyToOne(optional = false)
    private Vehiculo vehiculoidVehiculo;

    public Servicio() {
    }

    public Servicio(String idServicio, int clienteRut, Collection<Persona> personaCollection, Collection<Persona> personaCollection1, Encomienda encomiendaidEncomienda, Mediopago mediopagoidMedioPago, Recorrido recorridoidRecorrido, Vehiculo vehiculoidVehiculo) {
        this.idServicio = idServicio;
        this.clienteRut = clienteRut;
        this.personaCollection = personaCollection;
        this.personaCollection1 = personaCollection1;
        this.encomiendaidEncomienda = encomiendaidEncomienda;
        this.mediopagoidMedioPago = mediopagoidMedioPago;
        this.recorridoidRecorrido = recorridoidRecorrido;
        this.vehiculoidVehiculo = vehiculoidVehiculo;
    }
    
    public Servicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public Servicio(String idServicio, int clienteRut) {
        this.idServicio = idServicio;
        this.clienteRut = clienteRut;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public int getClienteRut() {
        return clienteRut;
    }

    public void setClienteRut(int clienteRut) {
        this.clienteRut = clienteRut;
    }

    public Collection<Persona> getPersonaCollection() {
        return personaCollection;
    }

    public void setPersonaCollection(Collection<Persona> personaCollection) {
        this.personaCollection = personaCollection;
    }

    public Collection<Persona> getPersonaCollection1() {
        return personaCollection1;
    }

    public void setPersonaCollection1(Collection<Persona> personaCollection1) {
        this.personaCollection1 = personaCollection1;
    }

    public Encomienda getEncomiendaidEncomienda() {
        return encomiendaidEncomienda;
    }

    public void setEncomiendaidEncomienda(Encomienda encomiendaidEncomienda) {
        this.encomiendaidEncomienda = encomiendaidEncomienda;
    }

    public Mediopago getMediopagoidMedioPago() {
        return mediopagoidMedioPago;
    }

    public void setMediopagoidMedioPago(Mediopago mediopagoidMedioPago) {
        this.mediopagoidMedioPago = mediopagoidMedioPago;
    }

    public Recorrido getRecorridoidRecorrido() {
        return recorridoidRecorrido;
    }

    public void setRecorridoidRecorrido(Recorrido recorridoidRecorrido) {
        this.recorridoidRecorrido = recorridoidRecorrido;
    }

    public Vehiculo getVehiculoidVehiculo() {
        return vehiculoidVehiculo;
    }

    public void setVehiculoidVehiculo(Vehiculo vehiculoidVehiculo) {
        this.vehiculoidVehiculo = vehiculoidVehiculo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServicio != null ? idServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.idServicio == null && other.idServicio != null) || (this.idServicio != null && !this.idServicio.equals(other.idServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Servicio[ idServicio=" + idServicio + " ]";
    }
    
}
