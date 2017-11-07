/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Felipe
 */
@Entity
@Table(name = "recorrido")
@NamedQueries({
    @NamedQuery(name = "Recorrido.findAll", query = "SELECT r FROM Recorrido r")})
public class Recorrido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRecorrido")
    private Integer idRecorrido;
    @Size(max = 45)
    @Column(name = "Llegada")
    private String llegada;
    @Size(max = 45)
    @Column(name = "Salida")
    private String salida;
    @Size(max = 60)
    @Column(name = "DireccionRetiro")
    private String retiro;
    @Size(max = 60)
    @Column(name = "DireccionEnvio")
    private String envio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recorridoidRecorrido")
    private Collection<Servicio> servicioCollection;

    public Recorrido() {
    }

    public Recorrido(Integer idRecorrido, String llegada, String salida, String retiro, String envio, Collection<Servicio> servicioCollection) {
        this.idRecorrido = idRecorrido;
        this.llegada = llegada;
        this.salida = salida;
        this.retiro = retiro;
        this.envio = envio;
        this.servicioCollection = servicioCollection;
    }

    public Recorrido(Integer idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public Integer getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdRecorrido(Integer idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getRetiro() {
        return retiro;
    }

    public void setRetiro(String retiro) {
        this.retiro = retiro;
    }

    public String getEnvio() {
        return envio;
    }

    public void setEnvio(String envio) {
        this.envio = envio;
    }

    public Collection<Servicio> getServicioCollection() {
        return servicioCollection;
    }

    public void setServicioCollection(Collection<Servicio> servicioCollection) {
        this.servicioCollection = servicioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecorrido != null ? idRecorrido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recorrido)) {
            return false;
        }
        Recorrido other = (Recorrido) object;
        if ((this.idRecorrido == null && other.idRecorrido != null) || (this.idRecorrido != null && !this.idRecorrido.equals(other.idRecorrido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Recorrido[ idRecorrido=" + idRecorrido + " ]";
    }

}
