/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.manacou.youfood.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Kevin
 */
@Entity
public class Statut implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStatut;
    
    private String label;

    public Long getId() {
        return idStatut;
    }

    public void setId(Long id) {
        this.idStatut = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStatut != null ? idStatut.hashCode() : 0);
        return hash;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statut)) {
            return false;
        }
        Statut other = (Statut) object;
        if ((this.idStatut == null && other.idStatut != null) || (this.idStatut != null && !this.idStatut.equals(other.idStatut))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.manacou.youfood.entities.Statut[ id=" + idStatut + " ]";
    }
    
}
