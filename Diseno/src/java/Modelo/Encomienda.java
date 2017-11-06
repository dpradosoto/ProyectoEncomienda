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
@Table(name = "encomienda")
@NamedQueries({
    @NamedQuery(name = "Encomienda.findAll", query = "SELECT e FROM Encomienda e")})
public class Encomienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEncomienda")
    private Integer idEncomienda;
    @Size(max = 45)
    @Column(name = "TipoEncomienda")
    private String tipoEncomienda;
    @Size(max = 45)
    @Column(name = "Peso")
    private String peso;
    @Size(max = 45)
    @Column(name = "Largo")
    private Integer largo;
    @Size(max = 3)
    @Column(name = "Ancho")
    private Integer ancho;
    @Size(max = 3)
    @Column(name = "Alto")
    private Integer alto;
    @Size(max = 3)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "encomiendaidEncomienda")
    private Collection<Servicio> servicioCollection;

    public Encomienda() {
        
    }

    public Encomienda(Integer idEncomienda, String tipoEncomienda, String peso, Integer largo, Integer ancho, Integer alto , String descripcion, Collection<Servicio> servicioCollection) {
        this.idEncomienda = idEncomienda;
        this.tipoEncomienda = tipoEncomienda;
        this.peso = peso;
          this.largo = largo;
            this.ancho = ancho;
              this.alto = alto;
        this.descripcion = descripcion;
        this.servicioCollection = servicioCollection;
    }
    

    public Encomienda(Integer idEncomienda) {
        this.idEncomienda = idEncomienda;
    }

    public Integer getIdEncomienda() {
        return idEncomienda;
    }

    public void setIdEncomienda(Integer idEncomienda) {
        this.idEncomienda = idEncomienda;
    }

    public String getTipoEncomienda() {
        return tipoEncomienda;
    }

    public void setTipoEncomienda(String tipoEncomienda) {
        this.tipoEncomienda = tipoEncomienda;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
      public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
      public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }
      public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idEncomienda != null ? idEncomienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encomienda)) {
            return false;
        }
        Encomienda other = (Encomienda) object;
        if ((this.idEncomienda == null && other.idEncomienda != null) || (this.idEncomienda != null && !this.idEncomienda.equals(other.idEncomienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Encomienda[ idEncomienda=" + idEncomienda + " ]";
    }
    
}
