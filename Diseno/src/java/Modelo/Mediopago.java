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
@Table(name = "mediopago")
@NamedQueries({
    @NamedQuery(name = "Mediopago.findAll", query = "SELECT m FROM Mediopago m")})
public class Mediopago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMedioPago")
    private Integer idMedioPago;
    @Size(max = 45)
    @Column(name = "Efectivo")
    private String efectivo;
    @Size(max = 45)
    @Column(name = "TarjetaCredito")
    private String tarjetaCredito;
    @Size(max = 45)
    @Column(name = "TarjetaDebito")
    private String tarjetaDebito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mediopagoidMedioPago")
    private Collection<Servicio> servicioCollection;

    public Mediopago() {
    }

    public Mediopago(Integer idMedioPago, String efectivo, String tarjetaCredito, String tarjetaDebito, Collection<Servicio> servicioCollection) {
        this.idMedioPago = idMedioPago;
        this.efectivo = efectivo;
        this.tarjetaCredito = tarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
        this.servicioCollection = servicioCollection;
    }
    
    public Mediopago(Integer idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public Integer getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(Integer idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(String tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
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
        hash += (idMedioPago != null ? idMedioPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mediopago)) {
            return false;
        }
        Mediopago other = (Mediopago) object;
        if ((this.idMedioPago == null && other.idMedioPago != null) || (this.idMedioPago != null && !this.idMedioPago.equals(other.idMedioPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Mediopago[ idMedioPago=" + idMedioPago + " ]";
    }
    
}
