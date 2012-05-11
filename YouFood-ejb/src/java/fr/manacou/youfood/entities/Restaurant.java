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
public class Restaurant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRestaurant;
    
    private String adresse;

    public Long getId() {
        return idRestaurant;
    }

    public void setId(Long id) {
        this.idRestaurant = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRestaurant != null ? idRestaurant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) object;
        if ((this.idRestaurant == null && other.idRestaurant != null) || (this.idRestaurant != null && !this.idRestaurant.equals(other.idRestaurant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.manacou.youfood.dao.Restaurants[ id=" + idRestaurant + " ]";
    }
    
}
