/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.ensi.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "formations", catalog = "rh_testdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Formation.findAll", query = "SELECT f FROM Formation f")
    , @NamedQuery(name = "Formation.findByIdF", query = "SELECT f FROM Formation f WHERE f.idF = :idF")
    , @NamedQuery(name = "Formation.findByLibelle", query = "SELECT f FROM Formation f WHERE f.libelle = :libelle")
    , @NamedQuery(name = "Formation.findByEtat", query = "SELECT f FROM Formation f WHERE f.etat = :etat")
    , @NamedQuery(name = "Formation.findByIdU", query = "SELECT f FROM Formation f WHERE f.idU = :idU")})
public class Formation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdF")
    private Integer idF;
    @Size(max = 50)
    @Column(name = "Libelle")
    private String libelle;
    @Size(max = 20)
    @Column(name = "Etat")
    private String etat;
    @Column(name = "IdU")
    private Integer idU;

    public Formation() {
    }

    public Formation(Integer idF) {
        this.idF = idF;
    }

    public Integer getIdF() {
        return idF;
    }

    public void setIdF(Integer idF) {
        this.idF = idF;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Integer getIdU() {
        return idU;
    }

    public void setIdU(Integer idU) {
        this.idU = idU;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idF != null ? idF.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.idF == null && other.idF != null) || (this.idF != null && !this.idF.equals(other.idF))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tn.ensi.entities.Formation[ idF=" + idF + " ]";
    }
    
}
